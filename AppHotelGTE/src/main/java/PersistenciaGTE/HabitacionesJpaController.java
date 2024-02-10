package PersistenciaGTE;

import PersistenciaGTE.exceptions.NonexistentEntityException;
import TablasClases.Habitaciones;
import TablasClases.Reservaciones;
import TablasClases.Ventas_Habitaciones;
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

public class HabitacionesJpaController implements Serializable {

    public HabitacionesJpaController() {
       this.emf = Persistence.createEntityManagerFactory("HotelGTEPersistence");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Habitaciones habitaciones) {
        if (habitaciones.getVentas_Habitaciones() == null) {
            habitaciones.setVentas_Habitaciones(new ArrayList<Ventas_Habitaciones>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Reservaciones reservacion = habitaciones.getReservacion();
            if (reservacion != null) {
                reservacion = em.getReference(reservacion.getClass(), reservacion.getId_Reserva());
                habitaciones.setReservacion(reservacion);
            }
            List<Ventas_Habitaciones> attachedVentas_Habitaciones = new ArrayList<Ventas_Habitaciones>();
            for (Ventas_Habitaciones ventas_HabitacionesVentas_HabitacionesToAttach : habitaciones.getVentas_Habitaciones()) {
                ventas_HabitacionesVentas_HabitacionesToAttach = em.getReference(ventas_HabitacionesVentas_HabitacionesToAttach.getClass(), ventas_HabitacionesVentas_HabitacionesToAttach.getId_Venta());
                attachedVentas_Habitaciones.add(ventas_HabitacionesVentas_HabitacionesToAttach);
            }
            habitaciones.setVentas_Habitaciones(attachedVentas_Habitaciones);
            em.persist(habitaciones);
            if (reservacion != null) {
                reservacion.getHabitaciones().add(habitaciones);
                reservacion = em.merge(reservacion);
            }
            for (Ventas_Habitaciones ventas_HabitacionesVentas_Habitaciones : habitaciones.getVentas_Habitaciones()) {
                Habitaciones oldHabitacionesVOfVentas_HabitacionesVentas_Habitaciones = ventas_HabitacionesVentas_Habitaciones.getHabitacionesV();
                ventas_HabitacionesVentas_Habitaciones.setHabitacionesV(habitaciones);
                ventas_HabitacionesVentas_Habitaciones = em.merge(ventas_HabitacionesVentas_Habitaciones);
                if (oldHabitacionesVOfVentas_HabitacionesVentas_Habitaciones != null) {
                    oldHabitacionesVOfVentas_HabitacionesVentas_Habitaciones.getVentas_Habitaciones().remove(ventas_HabitacionesVentas_Habitaciones);
                    oldHabitacionesVOfVentas_HabitacionesVentas_Habitaciones = em.merge(oldHabitacionesVOfVentas_HabitacionesVentas_Habitaciones);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Habitaciones habitaciones) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Habitaciones persistentHabitaciones = em.find(Habitaciones.class, habitaciones.getId_Habitacion());
            Reservaciones reservacionOld = persistentHabitaciones.getReservacion();
            Reservaciones reservacionNew = habitaciones.getReservacion();
            List<Ventas_Habitaciones> ventas_HabitacionesOld = persistentHabitaciones.getVentas_Habitaciones();
            List<Ventas_Habitaciones> ventas_HabitacionesNew = habitaciones.getVentas_Habitaciones();
            if (reservacionNew != null) {
                reservacionNew = em.getReference(reservacionNew.getClass(), reservacionNew.getId_Reserva());
                habitaciones.setReservacion(reservacionNew);
            }
            List<Ventas_Habitaciones> attachedVentas_HabitacionesNew = new ArrayList<Ventas_Habitaciones>();
            for (Ventas_Habitaciones ventas_HabitacionesNewVentas_HabitacionesToAttach : ventas_HabitacionesNew) {
                ventas_HabitacionesNewVentas_HabitacionesToAttach = em.getReference(ventas_HabitacionesNewVentas_HabitacionesToAttach.getClass(), ventas_HabitacionesNewVentas_HabitacionesToAttach.getId_Venta());
                attachedVentas_HabitacionesNew.add(ventas_HabitacionesNewVentas_HabitacionesToAttach);
            }
            ventas_HabitacionesNew = attachedVentas_HabitacionesNew;
            habitaciones.setVentas_Habitaciones(ventas_HabitacionesNew);
            habitaciones = em.merge(habitaciones);
            if (reservacionOld != null && !reservacionOld.equals(reservacionNew)) {
                reservacionOld.getHabitaciones().remove(habitaciones);
                reservacionOld = em.merge(reservacionOld);
            }
            if (reservacionNew != null && !reservacionNew.equals(reservacionOld)) {
                reservacionNew.getHabitaciones().add(habitaciones);
                reservacionNew = em.merge(reservacionNew);
            }
            for (Ventas_Habitaciones ventas_HabitacionesOldVentas_Habitaciones : ventas_HabitacionesOld) {
                if (!ventas_HabitacionesNew.contains(ventas_HabitacionesOldVentas_Habitaciones)) {
                    ventas_HabitacionesOldVentas_Habitaciones.setHabitacionesV(null);
                    ventas_HabitacionesOldVentas_Habitaciones = em.merge(ventas_HabitacionesOldVentas_Habitaciones);
                }
            }
            for (Ventas_Habitaciones ventas_HabitacionesNewVentas_Habitaciones : ventas_HabitacionesNew) {
                if (!ventas_HabitacionesOld.contains(ventas_HabitacionesNewVentas_Habitaciones)) {
                    Habitaciones oldHabitacionesVOfVentas_HabitacionesNewVentas_Habitaciones = ventas_HabitacionesNewVentas_Habitaciones.getHabitacionesV();
                    ventas_HabitacionesNewVentas_Habitaciones.setHabitacionesV(habitaciones);
                    ventas_HabitacionesNewVentas_Habitaciones = em.merge(ventas_HabitacionesNewVentas_Habitaciones);
                    if (oldHabitacionesVOfVentas_HabitacionesNewVentas_Habitaciones != null && !oldHabitacionesVOfVentas_HabitacionesNewVentas_Habitaciones.equals(habitaciones)) {
                        oldHabitacionesVOfVentas_HabitacionesNewVentas_Habitaciones.getVentas_Habitaciones().remove(ventas_HabitacionesNewVentas_Habitaciones);
                        oldHabitacionesVOfVentas_HabitacionesNewVentas_Habitaciones = em.merge(oldHabitacionesVOfVentas_HabitacionesNewVentas_Habitaciones);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = habitaciones.getId_Habitacion();
                if (findHabitaciones(id) == null) {
                    throw new NonexistentEntityException("The habitaciones with id " + id + " no longer exists.");
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
            Habitaciones habitaciones;
            try {
                habitaciones = em.getReference(Habitaciones.class, id);
                habitaciones.getId_Habitacion();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The habitaciones with id " + id + " no longer exists.", enfe);
            }
            Reservaciones reservacion = habitaciones.getReservacion();
            if (reservacion != null) {
                reservacion.getHabitaciones().remove(habitaciones);
                reservacion = em.merge(reservacion);
            }
            List<Ventas_Habitaciones> ventas_Habitaciones = habitaciones.getVentas_Habitaciones();
            for (Ventas_Habitaciones ventas_HabitacionesVentas_Habitaciones : ventas_Habitaciones) {
                ventas_HabitacionesVentas_Habitaciones.setHabitacionesV(null);
                ventas_HabitacionesVentas_Habitaciones = em.merge(ventas_HabitacionesVentas_Habitaciones);
            }
            em.remove(habitaciones);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Habitaciones> findHabitacionesEntities() {
        return findHabitacionesEntities(true, -1, -1);
    }

    public List<Habitaciones> findHabitacionesEntities(int maxResults, int firstResult) {
        return findHabitacionesEntities(false, maxResults, firstResult);
    }

    private List<Habitaciones> findHabitacionesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Habitaciones.class));
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

    public Habitaciones findHabitaciones(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Habitaciones.class, id);
        } finally {
            em.close();
        }
    }

    public int getHabitacionesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Habitaciones> rt = cq.from(Habitaciones.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
