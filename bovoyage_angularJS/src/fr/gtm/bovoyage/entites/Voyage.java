package fr.gtm.bovoyage.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="destinations")

@NamedQueries({
	@NamedQuery(name="Voyage.getAll",
				query="from Voyage"),
	
})
public class Voyage  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="kp_destination")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id; 
	String region;
	String description;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ke_destination")
	List<DatesVoyage> dateVoyages;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="images",joinColumns=@JoinColumn(name="ke_destination"))
	@Column(name="image")
	List<String> images;
	

	public Voyage() {
		super();
	}

	public Voyage(String region) {
		super();
		this.region = region;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<DatesVoyage> getDateVoyages() {
		return dateVoyages;
	}
	public void setDateVoyages(List<DatesVoyage> dateVoyages) {
		this.dateVoyages = dateVoyages;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	
	
	
	

}
