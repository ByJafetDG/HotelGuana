package PersistenciaGTE;

import PersistenciaGTE.exceptions.NonexistentEntityException;
import TablasClases.Habitaciones;
import TablasClases.Reservaciones;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class ReservacionesJpaController implements Serializable {

    public ReservacionesJpaController() {
       this.emf = Persistence.createEntityManagerFactory("HotelGTEPersistence");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Reservaciones reservaciones) {
        if (reservaciones.getHabitaciones() == null) {
            reservaciones.setHabitaciones(new ArrayList<Habitaciones>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Habitaciones> attachedHabitaciones = new ArrayList<Habitaciones>();
            for (Habitaciones habitacionesHabitacionesToAttach : reservaciones.getHabitaciones()) {
                habitacionesHabitacionesToAttach = em.getReference(habitacionesHabitacionesToAttach.getClass(), habitacionesHabitacionesToAttach.getId_Habitacion());
                attachedHabitaciones.add(habitacionesHabitacionesToAttach);
            }
            reservaciones.setHabitaciones(attachedHabitaciones);
            em.persist(reservaciones);
            for (Habitaciones habitacionesHabitaciones : reservaciones.getHabitaciones()) {
                Reservaciones oldReservacionOfHabitacionesHabitaciones = habitacionesHabitaciones.getReservacion();
                habitacionesHabitaciones.setReservacion(reservaciones);
                habitacionesHabitaciones = em.merge(habitacionesHabitaciones);
                if (oldReservacionOfHabitacionesHabitaciones != null) {
                    oldReservacionOfHabitacionesHabitaciones.getHabitaciones().remove(habitacionesHabitaciones);
                    oldReservacionOfHabitacionesHabitaciones = em.merge(oldReservacionOfHabitacionesHabitaciones);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Reservaciones reservaciones) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Reservaciones persistentReservaciones = em.find(Reservaciones.class, reservaciones.getId_Reserva());
            List<Habitaciones> habitacionesOld = persistentReservaciones.getHabitaciones();
            List<Habitaciones> habitacionesNew = reservaciones.getHabitaciones();
            List<Habitaciones> attachedHabitacionesNew = new ArrayList<Habitaciones>();
            for (Habitaciones habitacionesNewHabitacionesToAttach : habitacionesNew) {
                habitacionesNewHabitacionesToAttach = em.getReference(habitacionesNewHabitacionesToAttach.getClass(), habitacionesNewHabitacionesToAttach.getId_Habitacion());
                attachedHabitacionesNew.add(habitacionesNewHabitacionesToAttach);
            }
            habitacionesNew = attachedHabitacionesNew;
            reservaciones.setHabitaciones(habitacionesNew);
            reservaciones = em.merge(reservaciones);
            for (Habitaciones habitacionesOldHabitaciones : habitacionesOld) {
                if (!habitacionesNew.contains(habitacionesOldHabitaciones)) {
                    habitacionesOldHabitaciones.setReservacion(null);
                    habitacionesOldHabitaciones = em.merge(habitacionesOldHabitaciones);
                }
            }
            for (Habitaciones habitacionesNewHabitaciones : habitacionesNew) {
                if (!habitacionesOld.contains(habitacionesNewHabitaciones)) {
                    Reservaciones oldReservacionOfHabitacionesNewHabitaciones = habitacionesNewHabitaciones.getReservacion();
                    habitacionesNewHabitaciones.setReservacion(reservaciones);
                    habitacionesNewHabitaciones = em.merge(habitacionesNewHabitaciones);
                    if (oldReservacionOfHabitacionesNewHabitaciones != null && !oldReservacionOfHabitacionesNewHabitaciones.equals(reservaciones)) {
                        oldReservacionOfHabitacionesNewHabitaciones.getHabitaciones().remove(habitacionesNewHabitaciones);
                        oldReservacionOfHabitacionesNewHabitaciones = em.merge(oldReservacionOfHabitacionesNewHabitaciones);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = reservaciones.getId_Reserva();
                if (findReservaciones(id) == null) {
                    throw new NonexistentEntityException("The reservaciones with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Reservaciones reservaciones;
            try {
                reservaciones = em.getReference(Reservaciones.class, id);
                reservaciones.getId_Reserva();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The reservaciones with id " + id + " no longer exists.", enfe);
            }
            List<Habitaciones> habitaciones = reservaciones.getHabitaciones();
            for (Habitaciones habitacionesHabitaciones : habitaciones) {
                habitacionesHabitaciones.setReservacion(null);
                habitacionesHabitaciones = em.merge(habitacionesHabitaciones);
            }
            em.remove(reservaciones);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Reservaciones> findReservacionesEntities() {
        return findReservacionesEntities(true, -1, -1);
    }

    public List<Reservaciones> findReservacionesEntities(int maxResults, int firstResult) {
        return findReservacionesEntities(false, maxResults, firstResult);
    }

    private List<Reservaciones> findReservacionesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Reservaciones.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Reservaciones findReservaciones(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Reservaciones.class, id);
        } finally {
            em.close();
        }
    }

    public int getReservacionesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Reservaciones> rt = cq.from(Reservaciones.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
