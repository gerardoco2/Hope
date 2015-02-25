package modelo.hibernate;

// Generated 25/02/2015 09:22:19 AM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import modelo.entidad.UsuarioEmpresa;
import modelo.entidad.UsuarioEmpresaId;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UsuarioEmpresa.
 * @see modelo.hibernate.UsuarioEmpresa
 * @author Hibernate Tools
 */
@Stateless
public class UsuarioEmpresaHome {

	private static final Log log = LogFactory.getLog(UsuarioEmpresaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UsuarioEmpresa transientInstance) {
		log.debug("persisting UsuarioEmpresa instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UsuarioEmpresa persistentInstance) {
		log.debug("removing UsuarioEmpresa instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UsuarioEmpresa merge(UsuarioEmpresa detachedInstance) {
		log.debug("merging UsuarioEmpresa instance");
		try {
			UsuarioEmpresa result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UsuarioEmpresa findById(UsuarioEmpresaId id) {
		log.debug("getting UsuarioEmpresa instance with id: " + id);
		try {
			UsuarioEmpresa instance = entityManager.find(UsuarioEmpresa.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
