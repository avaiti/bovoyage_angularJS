package fr.gtm.bovoyage.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="clients")

@NamedQueries({
@NamedQuery(name="Client.login", query="SELECT c FROM Client c where c.mail = :mail AND c.password = :password")
})
public class Client {
	@Id
	@Column(name="kp_client")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String civilite;
	String nom;
	String prenom;
	@Column(name="date_naissance")
	Date dateNaissance;
	String adresse;
	@Column(name="telephone")
	String numTel;
	String mail;
	String password;
	
	public Client() {
	}
	
	public Client(String civilite, String nom, String prenom, Date dateNaissance, String mail, String password) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.mail = mail;
		this.password = password;
	}
	
	public Client(String civilite, String nom, String prenom, Date dateNaissance, String adresse, String numTel,
			String mail, String password) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.numTel = numTel;
		this.mail = mail;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom
				+ ", dateNaissance=" + dateNaissance + ", adresse=" + adresse + ", numTel=" + numTel + ", mail=" + mail
				+ "]";
	}

	

}
