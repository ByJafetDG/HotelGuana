package PersistenciaGTE;

import PersistenciaGTE.exceptions.NonexistentEntityException;
import TablasClases.Cliente;
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


public class SucursalJpaController implements Serializable {

    public SucursalJpaController() {
       this.emf = Persistence.createEntityManagerFactory("HotelGTEPersistence");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sucursal sucursal) {
        if (sucursal.getCliente() == null) {
            sucursal.setCliente(new ArrayList<Cliente>());
        }
        if (sucursal.getUsuario() == null) {
            sucursal.setUsuario(new ArrayList<Usuario>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Cliente> attachedCliente = new ArrayList<Cliente>();
            for (Cliente clienteClienteToAttach : sucursal.getCliente()) {
                clienteClienteToAttach = em.getReference(clienteClienteToAttach.getClass(), clienteClienteToAttach.getId());
                attachedCliente.add(clienteClienteToAttach);
            }
            sucursal.setCliente(attachedCliente);
            List<Usuario> attachedUsuario = new ArrayList<Usuario>();
            for (Usuario usuarioUsuarioToAttach : sucursal.getUsuario()) {
                usuarioUsuarioToAttach = em.getReference(usuarioUsuarioToAttach.getClass(), usuarioUsuarioToAttach.getId());
                attachedUsuario.add(usuarioUsuarioToAttach);
            }
            sucursal.setUsuario(attachedUsuario);
            em.persist(sucursal);
            for (Cliente clienteCliente : sucursal.getCliente()) {
                Sucursal oldSucursalOfClienteCliente = clienteCliente.getSucursal();
                clienteCliente.setSucursal(sucursal);
                clienteCliente = em.merge(clienteCliente);
                if (oldSucursalOfClienteCliente != null) {
                    oldSucursalOfClienteCliente.getCliente().remove(clienteCliente);
                    oldSucursalOfClienteCliente = em.merge(oldSucursalOfClienteCliente);
                }
            }
            for (Usuario usuarioUsuario : sucursal.getUsuario()) {
                Sucursal oldSucursalUOfUsuarioUsuario = usuarioUsuario.getSucursalU();
                usuarioUsuario.setSucursalU(sucursal);
                usuarioUsuario = em.merge(usuarioUsuario);
                if (oldSucursalUOfUsuarioUsuario != null) {
                    oldSucursalUOfUsuarioUsuario.getUsuario().remove(usuarioUsuario);
                    oldSucursalUOfUsuarioUsuario = em.merge(oldSucursalUOfUsuarioUsuario);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sucursal sucursal) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sucursal persistentSucursal = em.find(Sucursal.class, sucursal.getId());
            List<Cliente> clienteOld = persistentSucursal.getCliente();
            List<Cliente> clienteNew = sucursal.getCliente();
            List<Usuario> usuarioOld = persistentSucursal.getUsuario();
            List<Usuario> usuarioNew = sucursal.getUsuario();
            List<Cliente> attachedClienteNew = new ArrayList<Cliente>();
            for (Cliente clienteNewClienteToAttach : clienteNew) {
                clienteNewClienteToAttach = em.getReference(clienteNewClienteToAttach.getClass(), clienteNewClienteToAttach.getId());
                attachedClienteNew.add(clienteNewClienteToAttach);
            }
            clienteNew = attachedClienteNew;
            sucursal.setCliente(clienteNew);
            List<Usuario> attachedUsuarioNew = new ArrayList<Usuario>();
            for (Usuario usuarioNewUsuarioToAttach : usuarioNew) {
                usuarioNewUsuarioToAttach = em.getReference(usuarioNewUsuarioToAttach.getClass(), usuarioNewUsuarioToAttach.getId());
                attachedUsuarioNew.add(usuarioNewUsuarioToAttach);
            }
            usuarioNew = attachedUsuarioNew;
            sucursal.setUsuario(usuarioNew);
            sucursal = em.merge(sucursal);
            for (Cliente clienteOldCliente : clienteOld) {
                if (!clienteNew.contains(clienteOldCliente)) {
                    clienteOldCliente.setSucursal(null);
                    clienteOldCliente = em.merge(clienteOldCliente);
                }
            }
            for (Cliente clienteNewCliente : clienteNew) {
                if (!clienteOld.contains(clienteNewCliente)) {
                    Sucursal oldSucursalOfClienteNewCliente = clienteNewCliente.getSucursal();
                    clienteNewCliente.setSucursal(sucursal);
                    clienteNewCliente = em.merge(clienteNewCliente);
                    if (oldSucursalOfClienteNewCliente != null && !oldSucursalOfClienteNewCliente.equals(sucursal)) {
                        oldSucursalOfClienteNewCliente.getCliente().remove(clienteNewCliente);
                        oldSucursalOfClienteNewCliente = em.merge(oldSucursalOfClienteNewCliente);
                    }
                }
            }
            for (Usuario usuarioOldUsuario : usuarioOld) {
                if (!usuarioNew.contains(usuarioOldUsuario)) {
                    usuarioOldUsuario.setSucursalU(null);
                    usuarioOldUsuario = em.merge(usuarioOldUsuario);
                }
            }
            for (Usuario usuarioNewUsuario : usuarioNew) {
                if (!usuarioOld.contains(usuarioNewUsuario)) {
                    Sucursal oldSucursalUOfUsuarioNewUsuario = usuarioNewUsuario.getSucursalU();
                    usuarioNewUsuario.setSucursalU(sucursal);
                    usuarioNewUsuario = em.merge(usuarioNewUsuario);
                    if (oldSucursalUOfUsuarioNewUsuario != null && !oldSucursalUOfUsuarioNewUsuario.equals(sucursal)) {
                        oldSucursalUOfUsuarioNewUsuario.getUsuario().remove(usuarioNewUsuario);
                        oldSucursalUOfUsuarioNewUsuario = em.merge(oldSucursalUOfUsuarioNewUsuario);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = sucursal.getId();
                if (findSucursal(id) == null) {
                    throw new NonexistentEntityException("The sucursal with id " + id + " no longer exists.");
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
            Sucursal sucursal;
            try {
                sucursal = em.getReference(Sucursal.class, id);
                sucursal.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sucursal with id " + id + " no longer exists.", enfe);
            }
            List<Cliente> cliente = sucursal.getCliente();
            for (Cliente clienteCliente : cliente) {
                clienteCliente.setSucursal(null);
                clienteCliente = em.merge(clienteCliente);
            }
            List<Usuario> usuario = sucursal.getUsuario();
            for (Usuario usuarioUsuario : usuario) {
                usuarioUsuario.setSucursalU(null);
                usuarioUsuario = em.merge(usuarioUsuario);
            }
            em.remove(sucursal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sucursal> findSucursalEntities() {
        return findSucursalEntities(true, -1, -1);
    }

    public List<Sucursal> findSucursalEntities(int maxResults, int firstResult) {
        return findSucursalEntities(false, maxResults, firstResult);
    }

    private List<Sucursal> findSucursalEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sucursal.class));
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

    public Sucursal findSucursal(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sucursal.class, id);
        } finally {
            em.close();
        }
    }

    public int getSucursalCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sucursal> rt = cq.from(Sucursal.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
