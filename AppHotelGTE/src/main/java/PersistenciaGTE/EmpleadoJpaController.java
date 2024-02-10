package PersistenciaGTE;

import PersistenciaGTE.exceptions.NonexistentEntityException;
import TablasClases.Empleado;
import TablasClases.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Fiorella
 */
public class EmpleadoJpaController implements Serializable {

    public EmpleadoJpaController() {
       this.emf = Persistence.createEntityManagerFactory("HotelGTEPersistence");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Empleado empleado) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Usuario usuarioEmpleado = empleado.getUsuarioEmpleado();
            if (usuarioEmpleado != null) {
                usuarioEmpleado = em.getReference(usuarioEmpleado.getClass(), usuarioEmpleado.getId());
                empleado.setUsuarioEmpleado(usuarioEmpleado);
            }
            em.persist(empleado);
            if (usuarioEmpleado != null) {
                usuarioEmpleado.getEmpleados().add(empleado);
                usuarioEmpleado = em.merge(usuarioEmpleado);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Empleado empleado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Empleado persistentEmpleado = em.find(Empleado.class, empleado.getId());
            Usuario usuarioEmpleadoOld = persistentEmpleado.getUsuarioEmpleado();
            Usuario usuarioEmpleadoNew = empleado.getUsuarioEmpleado();
            if (usuarioEmpleadoNew != null) {
                usuarioEmpleadoNew = em.getReference(usuarioEmpleadoNew.getClass(), usuarioEmpleadoNew.getId());
                empleado.setUsuarioEmpleado(usuarioEmpleadoNew);
            }
            empleado = em.merge(empleado);
            if (usuarioEmpleadoOld != null && !usuarioEmpleadoOld.equals(usuarioEmpleadoNew)) {
                usuarioEmpleadoOld.getEmpleados().remove(empleado);
                usuarioEmpleadoOld = em.merge(usuarioEmpleadoOld);
            }
            if (usuarioEmpleadoNew != null && !usuarioEmpleadoNew.equals(usuarioEmpleadoOld)) {
                usuarioEmpleadoNew.getEmpleados().add(empleado);
                usuarioEmpleadoNew = em.merge(usuarioEmpleadoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = empleado.getId();
                if (findEmpleado(id) == null) {
                    throw new NonexistentEntityException("The empleado with id " + id + " no longer exists.");
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
            Empleado empleado;
            try {
                empleado = em.getReference(Empleado.class, id);
                empleado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The empleado with id " + id + " no longer exists.", enfe);
            }
            Usuario usuarioEmpleado = empleado.getUsuarioEmpleado();
            if (usuarioEmpleado != null) {
                usuarioEmpleado.getEmpleados().remove(empleado);
                usuarioEmpleado = em.merge(usuarioEmpleado);
            }
            em.remove(empleado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Empleado> findEmpleadoEntities() {
        return findEmpleadoEntities(true, -1, -1);
    }

    public List<Empleado> findEmpleadoEntities(int maxResults, int firstResult) {
        return findEmpleadoEntities(false, maxResults, firstResult);
    }

    private List<Empleado> findEmpleadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Empleado.class));
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

    public Empleado findEmpleado(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Empleado.class, id);
        } finally {
            em.close();
        }
    }

    public int getEmpleadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Empleado> rt = cq.from(Empleado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
