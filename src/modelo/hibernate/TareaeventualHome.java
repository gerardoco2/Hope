package modelo.hibernate;

// Generated 25/02/2015 09:22:19 AM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import modelo.entidad.Tareaeventual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tareaeventual.
 * @see modelo.hibernate.Tareaeventual
 * @author Hibernate Tools
 */
@Stateless
public class TareaeventualHome {

	private static final Log log = LogFactory.getLog(TareaeventualHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Tareaeventual transientInstance) {
		log.debug("persisting Tareaeventual instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Tareaeventual persistentInstance) {
		log.debug("removing Tareaeventual instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Tareaeventual merge(Tareaeventual detachedInstance) {
		log.debug("merging Tareaeventual instance");
		try {
			Tareaeventual result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tareaeventual findById(int id) {
		log.debug("getting Tareaeventual instance with id: " + id);
		try {
			Tareaeventual instance = entityManager
					.find(Tareaeventual.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
