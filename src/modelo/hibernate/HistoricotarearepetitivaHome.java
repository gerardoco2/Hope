package modelo.hibernate;

// Generated 25/02/2015 09:22:19 AM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import modelo.entidad.Historicotarearepetitiva;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Historicotarearepetitiva.
 * @see modelo.hibernate.Historicotarearepetitiva
 * @author Hibernate Tools
 */
@Stateless
public class HistoricotarearepetitivaHome {

	private static final Log log = LogFactory
			.getLog(HistoricotarearepetitivaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Historicotarearepetitiva transientInstance) {
		log.debug("persisting Historicotarearepetitiva instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Historicotarearepetitiva persistentInstance) {
		log.debug("removing Historicotarearepetitiva instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Historicotarearepetitiva merge(
			Historicotarearepetitiva detachedInstance) {
		log.debug("merging Historicotarearepetitiva instance");
		try {
			Historicotarearepetitiva result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Historicotarearepetitiva findById(int id) {
		log.debug("getting Historicotarearepetitiva instance with id: " + id);
		try {
			Historicotarearepetitiva instance = entityManager.find(
					Historicotarearepetitiva.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
