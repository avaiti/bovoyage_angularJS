package fr.gtm.bovoyage.service;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import fr.gtm.bovoyage.dao.VoyageDao;
import fr.gtm.bovoyage.entites.DatesVoyage;
import fr.gtm.bovoyage.entites.Participant;
import fr.gtm.bovoyage.entites.Voyage;

public class VoyageService {
	private VoyageDao dao;
	
	public VoyageService(EntityManagerFactory emf) {
		dao = new VoyageDao(emf);
	}
	
	public List<Voyage> getAllVoyages(){
		return dao.getAllVoyages();
	}
	
	public List<DatesVoyage> getDatesVoyagesByVoyageId(int id){
		return dao.getDatesVoyagesByVoyageId(id);
	}
	
	public List<String> getImagesByVoyageId(int id){
		return dao.getImagesByVoyageId(id);
	}
	
	public Voyage getVoyageById(int id){
		return dao.getVoyageById(id);
	}
	
	public void saveOrUpdate(Participant p){
		dao.saveOrUpdate(p);
	}
}
