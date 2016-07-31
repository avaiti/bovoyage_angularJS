package fr.gtm.bovoyage.service;

import javax.persistence.EntityManagerFactory;

import fr.gtm.bovoyage.dao.ClientDao;
import fr.gtm.bovoyage.entites.Client;

public class ClientService {
	private ClientDao dao;
	
	public ClientService(EntityManagerFactory emf) {
		dao = new ClientDao(emf);
	}
	
	public void saveOrUpdate(Client c){
		dao.saveOrUpdate(c);
	}
}
