package sopra.rdv4.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Lieu {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nom;
private String informations;
@ManyToOne
@JoinColumn(name="praticien_id")
private Praticien praticien;
@OneToMany (mappedBy="lieu")
private List<Creneau>creneaux;
@Embedded
private Adresse adresse;

	public Lieu() {}
	
	

	public Lieu(String nom, String informations) {
		this.nom = nom;
		this.informations = informations;
	}

	public Lieu(Long id, String nom, String informations, Praticien praticien, List<Creneau> creneaux,
			Adresse adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.informations = informations;
		this.praticien = praticien;
		this.creneaux = creneaux;
		this.adresse = adresse;
	}

	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getInformations() {
		return informations;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setInformations(String informations) {
		this.informations = informations;
	}
	
	public Praticien getPraticien() {
		return praticien;
	}

	public List<Creneau> getCreneaux() {
		return creneaux;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public void setCreneaux(List<Creneau> creneaux) {
		this.creneaux = creneaux;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Lieu [id=" + id + ", nom=" + nom + ", informations=" + informations + ", creneaux=" + creneaux
				+ ", adresse=" + adresse + "]";
	}

}
