package modelo.hibernate;

// Generated 25/02/2015 09:22:19 AM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import modelo.entidad.Historicotareaeventual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Historicotareaeventual.
 * @see modelo.hibernate.Historicotareaeventual
 * @author Hibernate Tools
 */
@Stateless
public class HistoricotareaeventualHome {

	private static final Log log = LogFactory
			.getLog(HistoricotareaeventualHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Historicotareaeventual transientInstance) {
		log.debug("persisting Historicotareaeventual instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Historicotareaeventual persistentInstance) {
		log.debug("removing Historicotareaeventual instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Historicotareaeventual merge(Historicotareaeventual detachedInstance) {
		log.debug("merging Historicotareaeventual instance");
		try {
			Historicotareaeventual result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Historicotareaeventual findById(int id) {
		log.debug("getting Historicotareaeventual instance with id: " + id);
		try {
			Historicotareaeventual instance = entityManager.find(
					Historicotareaeventual.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
