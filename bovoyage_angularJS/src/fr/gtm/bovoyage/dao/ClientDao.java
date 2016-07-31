package fr.gtm.bovoyage.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import fr.gtm.bovoyage.entites.Client;

public class ClientDao {
	private EntityManagerFactory emf;

	public ClientDao(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	public void saveOrUpdate(Client c){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		if(c.getId() == 0){
			em.persist(c);
		}else{
			em.merge(c);
		}
		em.getTransaction().commit();
		em.close();
	}
	

}
