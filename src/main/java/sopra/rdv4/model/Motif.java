package sopra.rdv4.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Motif {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String nom;
 private int nbCreneau; 
 @OneToMany(mappedBy="motif")
 private List<Consultation> consultation;
 @ManyToOne
 @JoinColumn(name="specialite_id")
 private Specialite specialite;
 
	public Motif(Long id, String nom, int nbCreneau, List<Consultation> consultation, Specialite specialite) {
	super();
	this.id = id;
	this.nom = nom;
	this.nbCreneau = nbCreneau;
	this.consultation = consultation;
	this.specialite = specialite;
}

	public Motif() {}

	public Motif(Long id, String nom, int nbCreneau) {
		super();
		this.id = id;
		this.nom = nom;
		this.nbCreneau = nbCreneau;
	}
	

	public Motif(String nom, int nbCreneau) {
		this.nom = nom;
		this.nbCreneau = nbCreneau;
	}

	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public int getNbCreneau() {
		return nbCreneau;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNbCreneau(int nbCreneau) {
		this.nbCreneau = nbCreneau;
	}
	
	public List<Consultation> getConsultation() {
		return consultation;
	}

	public Specialite getSpecialite() {
		return specialite;
	}

	public void setConsultation(List<Consultation> consultation) {
		this.consultation = consultation;
	}

	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Motif [id=" + id + ", nom=" + nom + ", nbCreneau=" + nbCreneau + ", consultation=" + consultation
				+ ", specialite=" + specialite + "]";
	}

}
