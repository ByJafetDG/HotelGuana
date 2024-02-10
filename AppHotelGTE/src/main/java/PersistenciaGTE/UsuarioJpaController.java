package PersistenciaGTE;

import PersistenciaGTE.exceptions.NonexistentEntityException;
import TablasClases.Empleado;
import TablasClases.Sucursal;
import TablasClases.Usuario;
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


public class UsuarioJpaController implements Serializable {

    public UsuarioJpaController() {
        this.emf = Persistence.createEntityManagerFactory("HotelGTEPersistence");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Usuario usuario) {
        if (usuario.getEmpleados() == null) {
            usuario.setEmpleados(new ArrayList<Empleado>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sucursal sucursalU = usuario.getSucursalU();
            if (sucursalU != null) {
                sucursalU = em.getReference(sucursalU.getClass(), sucursalU.getId());
                usuario.setSucursalU(sucursalU);
            }
            List<Empleado> attachedEmpleados = new ArrayList<Empleado>();
            for (Empleado empleadosEmpleadoToAttach : usuario.getEmpleados()) {
                empleadosEmpleadoToAttach = em.getReference(empleadosEmpleadoToAttach.getClass(), empleadosEmpleadoToAttach.getId());
                attachedEmpleados.add(empleadosEmpleadoToAttach);
            }
            usuario.setEmpleados(attachedEmpleados);
            em.persist(usuario);
            if (sucursalU != null) {
                sucursalU.getUsuario().add(usuario);
                sucursalU = em.merge(sucursalU);
            }
            for (Empleado empleadosEmpleado : usuario.getEmpleados()) {
                Usuario oldUsuarioEmpleadoOfEmpleadosEmpleado = empleadosEmpleado.getUsuarioEmpleado();
                empleadosEmpleado.setUsuarioEmpleado(usuario);
                empleadosEmpleado = em.merge(empleadosEmpleado);
                if (oldUsuarioEmpleadoOfEmpleadosEmpleado != null) {
                    oldUsuarioEmpleadoOfEmpleadosEmpleado.getEmpleados().remove(empleadosEmpleado);
                    oldUsuarioEmpleadoOfEmpleadosEmpleado = em.merge(oldUsuarioEmpleadoOfEmpleadosEmpleado);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Usuario usuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Usuario persistentUsuario = em.find(Usuario.class, usuario.getId());
            Sucursal sucursalUOld = persistentUsuario.getSucursalU();
            Sucursal sucursalUNew = usuario.getSucursalU();
            List<Empleado> empleadosOld = persistentUsuario.getEmpleados();
            List<Empleado> empleadosNew = usuario.getEmpleados();
            if (sucursalUNew != null) {
                sucursalUNew = em.getReference(sucursalUNew.getClass(), sucursalUNew.getId());
                usuario.setSucursalU(sucursalUNew);
            }
            List<Empleado> attachedEmpleadosNew = new ArrayList<Empleado>();
            for (Empleado empleadosNewEmpleadoToAttach : empleadosNew) {
                empleadosNewEmpleadoToAttach = em.getReference(empleadosNewEmpleadoToAttach.getClass(), empleadosNewEmpleadoToAttach.getId());
                attachedEmpleadosNew.add(empleadosNewEmpleadoToAttach);
            }
            empleadosNew = attachedEmpleadosNew;
            usuario.setEmpleados(empleadosNew);
            usuario = em.merge(usuario);
            if (sucursalUOld != null && !sucursalUOld.equals(sucursalUNew)) {
                sucursalUOld.getUsuario().remove(usuario);
                sucursalUOld = em.merge(sucursalUOld);
            }
            if (sucursalUNew != null && !sucursalUNew.equals(sucursalUOld)) {
                sucursalUNew.getUsuario().add(usuario);
                sucursalUNew = em.merge(sucursalUNew);
            }
            for (Empleado empleadosOldEmpleado : empleadosOld) {
                if (!empleadosNew.contains(empleadosOldEmpleado)) {
                    empleadosOldEmpleado.setUsuarioEmpleado(null);
                    empleadosOldEmpleado = em.merge(empleadosOldEmpleado);
                }
            }
            for (Empleado empleadosNewEmpleado : empleadosNew) {
                if (!empleadosOld.contains(empleadosNewEmpleado)) {
                    Usuario oldUsuarioEmpleadoOfEmpleadosNewEmpleado = empleadosNewEmpleado.getUsuarioEmpleado();
                    empleadosNewEmpleado.setUsuarioEmpleado(usuario);
                    empleadosNewEmpleado = em.merge(empleadosNewEmpleado);
                    if (oldUsuarioEmpleadoOfEmpleadosNewEmpleado != null && !oldUsuarioEmpleadoOfEmpleadosNewEmpleado.equals(usuario)) {
                        oldUsuarioEmpleadoOfEmpleadosNewEmpleado.getEmpleados().remove(empleadosNewEmpleado);
                        oldUsuarioEmpleadoOfEmpleadosNewEmpleado = em.merge(oldUsuarioEmpleadoOfEmpleadosNewEmpleado);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = usuario.getId();
                if (findUsuario(id) == null) {
                    throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.");
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
            Usuario usuario;
            try {
                usuario = em.getReference(Usuario.class, id);
                usuario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.", enfe);
            }
            Sucursal sucursalU = usuario.getSucursalU();
            if (sucursalU != null) {
                sucursalU.getUsuario().remove(usuario);
                sucursalU = em.merge(sucursalU);
            }
            List<Empleado> empleados = usuario.getEmpleados();
            for (Empleado empleadosEmpleado : empleados) {
                empleadosEmpleado.setUsuarioEmpleado(null);
                empleadosEmpleado = em.merge(empleadosEmpleado);
            }
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Usuario> findUsuarioEntities() {
        return findUsuarioEntities(true, -1, -1);
    }

    public List<Usuario> findUsuarioEntities(int maxResults, int firstResult) {
        return findUsuarioEntities(false, maxResults, firstResult);
    }

    private List<Usuario> findUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usuario.class));
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

    public Usuario findUsuario(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            em.close();
        }
    }

    public int getUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Usuario> rt = cq.from(Usuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
