package fr.gtm.bovoyage.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import fr.gtm.bovoyage.entites.DatesVoyage;
import fr.gtm.bovoyage.entites.Participant;
import fr.gtm.bovoyage.entites.Voyage;

public class VoyageDao {
	private EntityManagerFactory emf;

	public  VoyageDao(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	@SuppressWarnings("unchecked")
	public List<Voyage> getAllVoyages(){
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("Voyage.getAll");
		List<Voyage> voyages = query.getResultList();
		em.close();
		return voyages;		
	}
	
	public List<DatesVoyage> getDatesVoyagesByVoyageId(int id) {
		List<DatesVoyage> datesVoyages = new ArrayList<>();
		EntityManager em = emf.createEntityManager();
		Voyage v = em.find(Voyage.class, id);
		for(DatesVoyage dv : v.getDateVoyages()){
			datesVoyages.add(dv);
		}
		em.close();
		return datesVoyages;
	}
	
	public List<String> getImagesByVoyageId(int id) {
		List<String> images = new ArrayList<>();
		EntityManager em = emf.createEntityManager();
		Voyage v = em.find(Voyage.class, id);
		for(String img : v.getImages()){
			images.add(img);
		}
		em.close();
		return images;
	}

	public Voyage getVoyageById(int id) {
		Voyage voyage = new Voyage();
		EntityManager em = emf.createEntityManager();
		
		voyage = em.find(Voyage.class, id);

		em.close();
		return voyage;
	}

	public void saveOrUpdate(Participant p){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		if(p.getId() == 0){
			em.persist(p);
		}else{
			em.merge(p);
		}
		em.getTransaction().commit();
		em.close();
	}
	
}
