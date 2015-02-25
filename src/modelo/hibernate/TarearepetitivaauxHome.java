package modelo.hibernate;

// Generated 25/02/2015 09:22:19 AM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import modelo.entidad.Tarearepetitivaaux;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tarearepetitivaaux.
 * @see modelo.hibernate.Tarearepetitivaaux
 * @author Hibernate Tools
 */
@Stateless
public class TarearepetitivaauxHome {

	private static final Log log = LogFactory
			.getLog(TarearepetitivaauxHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Tarearepetitivaaux transientInstance) {
		log.debug("persisting Tarearepetitivaaux instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Tarearepetitivaaux persistentInstance) {
		log.debug("removing Tarearepetitivaaux instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Tarearepetitivaaux merge(Tarearepetitivaaux detachedInstance) {
		log.debug("merging Tarearepetitivaaux instance");
		try {
			Tarearepetitivaaux result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tarearepetitivaaux findById(int id) {
		log.debug("getting Tarearepetitivaaux instance with id: " + id);
		try {
			Tarearepetitivaaux instance = entityManager.find(
					Tarearepetitivaaux.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
