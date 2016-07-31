package fr.gtm.bovoyage.entites;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="dates_voyages")
	public class DatesVoyage implements Serializable{
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="kp_date_voyage")
		private long id;
		@Column(name="date_depart")
		private Date depart;
		@Column(name="date_retour")
		private Date retour;
		private double prixHT;
		
		public DatesVoyage() {}
		
		public DatesVoyage(Date depart, Date retour) {
			this.depart = depart;
			this.retour = retour;
		}
		
		public DatesVoyage(Calendar depart, Calendar retour){
			this.depart = depart.getTime();
			this.retour = retour.getTime();
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public Date getDepart() {
			return depart;
		}

		public void setDepart(Date depart) {
			this.depart = depart;
		}

		public Date getRetour() {
			return retour;
		}

		public void setRetour(Date retour) {
			this.retour = retour;
		}

		public double getPrixHT() {
			return prixHT;
		}

		public void setPrixHT(double prixHT) {
			this.prixHT = prixHT;
		}

}
