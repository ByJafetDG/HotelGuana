package PersistenciaGTE;

import PersistenciaGTE.exceptions.NonexistentEntityException;
import TablasClases.Habitaciones;
import TablasClases.Ventas_Habitaciones;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class Ventas_HabitacionesJpaController implements Serializable {

    public Ventas_HabitacionesJpaController() {
        this.emf = Persistence.createEntityManagerFactory("HotelGTEPersistence");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Ventas_Habitaciones ventas_Habitaciones) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Habitaciones habitacionesV = ventas_Habitaciones.getHabitacionesV();
            if (habitacionesV != null) {
                habitacionesV = em.getReference(habitacionesV.getClass(), habitacionesV.getId_Habitacion());
                ventas_Habitaciones.setHabitacionesV(habitacionesV);
            }
            em.persist(ventas_Habitaciones);
            if (habitacionesV != null) {
                habitacionesV.getVentas_Habitaciones().add(ventas_Habitaciones);
                habitacionesV = em.merge(habitacionesV);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Ventas_Habitaciones ventas_Habitaciones) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Ventas_Habitaciones persistentVentas_Habitaciones = em.find(Ventas_Habitaciones.class, ventas_Habitaciones.getId_Venta());
            Habitaciones habitacionesVOld = persistentVentas_Habitaciones.getHabitacionesV();
            Habitaciones habitacionesVNew = ventas_Habitaciones.getHabitacionesV();
            if (habitacionesVNew != null) {
                habitacionesVNew = em.getReference(habitacionesVNew.getClass(), habitacionesVNew.getId_Habitacion());
                ventas_Habitaciones.setHabitacionesV(habitacionesVNew);
            }
            ventas_Habitaciones = em.merge(ventas_Habitaciones);
            if (habitacionesVOld != null && !habitacionesVOld.equals(habitacionesVNew)) {
                habitacionesVOld.getVentas_Habitaciones().remove(ventas_Habitaciones);
                habitacionesVOld = em.merge(habitacionesVOld);
            }
            if (habitacionesVNew != null && !habitacionesVNew.equals(habitacionesVOld)) {
                habitacionesVNew.getVentas_Habitaciones().add(ventas_Habitaciones);
                habitacionesVNew = em.merge(habitacionesVNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = ventas_Habitaciones.getId_Venta();
                if (findVentas_Habitaciones(id) == null) {
                    throw new NonexistentEntityException("The ventas_Habitaciones with id " + id + " no longer exists.");
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
            Ventas_Habitaciones ventas_Habitaciones;
            try {
                ventas_Habitaciones = em.getReference(Ventas_Habitaciones.class, id);
                ventas_Habitaciones.getId_Venta();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ventas_Habitaciones with id " + id + " no longer exists.", enfe);
            }
            Habitaciones habitacionesV = ventas_Habitaciones.getHabitacionesV();
            if (habitacionesV != null) {
                habitacionesV.getVentas_Habitaciones().remove(ventas_Habitaciones);
                habitacionesV = em.merge(habitacionesV);
            }
            em.remove(ventas_Habitaciones);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Ventas_Habitaciones> findVentas_HabitacionesEntities() {
        return findVentas_HabitacionesEntities(true, -1, -1);
    }

    public List<Ventas_Habitaciones> findVentas_HabitacionesEntities(int maxResults, int firstResult) {
        return findVentas_HabitacionesEntities(false, maxResults, firstResult);
    }

    private List<Ventas_Habitaciones> findVentas_HabitacionesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Ventas_Habitaciones.class));
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

    public Ventas_Habitaciones findVentas_Habitaciones(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Ventas_Habitaciones.class, id);
        } finally {
            em.close();
        }
    }

    public int getVentas_HabitacionesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Ventas_Habitaciones> rt = cq.from(Ventas_Habitaciones.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
