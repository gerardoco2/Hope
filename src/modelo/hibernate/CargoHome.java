package modelo.hibernate;

// Generated 25/02/2015 09:22:19 AM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import modelo.entidad.Cargo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Cargo.
 * @see modelo.hibernate.Cargo
 * @author Hibernate Tools
 */
@Stateless
public class CargoHome {

	private static final Log log = LogFactory.getLog(CargoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Cargo transientInstance) {
		log.debug("persisting Cargo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Cargo persistentInstance) {
		log.debug("removing Cargo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Cargo merge(Cargo detachedInstance) {
		log.debug("merging Cargo instance");
		try {
			Cargo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cargo findById(int id) {
		log.debug("getting Cargo instance with id: " + id);
		try {
			Cargo instance = entityManager.find(Cargo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
