package modelo.hibernate;

// Generated 25/02/2015 09:22:19 AM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import modelo.entidad.Tarearepetitiva;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tarearepetitiva.
 * @see modelo.hibernate.Tarearepetitiva
 * @author Hibernate Tools
 */
@Stateless
public class TarearepetitivaHome {

	private static final Log log = LogFactory.getLog(TarearepetitivaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Tarearepetitiva transientInstance) {
		log.debug("persisting Tarearepetitiva instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Tarearepetitiva persistentInstance) {
		log.debug("removing Tarearepetitiva instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Tarearepetitiva merge(Tarearepetitiva detachedInstance) {
		log.debug("merging Tarearepetitiva instance");
		try {
			Tarearepetitiva result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tarearepetitiva findById(int id) {
		log.debug("getting Tarearepetitiva instance with id: " + id);
		try {
			Tarearepetitiva instance = entityManager.find(
					Tarearepetitiva.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
