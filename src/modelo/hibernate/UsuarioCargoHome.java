package modelo.hibernate;

// Generated 25/02/2015 09:22:19 AM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import modelo.entidad.UsuarioCargo;
import modelo.entidad.UsuarioCargoId;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UsuarioCargo.
 * @see modelo.hibernate.UsuarioCargo
 * @author Hibernate Tools
 */
@Stateless
public class UsuarioCargoHome {

	private static final Log log = LogFactory.getLog(UsuarioCargoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UsuarioCargo transientInstance) {
		log.debug("persisting UsuarioCargo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UsuarioCargo persistentInstance) {
		log.debug("removing UsuarioCargo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UsuarioCargo merge(UsuarioCargo detachedInstance) {
		log.debug("merging UsuarioCargo instance");
		try {
			UsuarioCargo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UsuarioCargo findById(UsuarioCargoId id) {
		log.debug("getting UsuarioCargo instance with id: " + id);
		try {
			UsuarioCargo instance = entityManager.find(UsuarioCargo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
