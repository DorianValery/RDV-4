package sopra.rdv4.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
@Entity
public class Creneau {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private LocalDateTime debut;
private Integer duree;
private boolean dispo;
//@ManyToOne
//@JoinColumn(name="praticien_id")
//private Praticien praticien;
@ManyToOne
@JoinColumn(name="lieu_id")
private Lieu lieu;
@ManyToOne
@JoinColumn(name="consultation_id")
private Consultation consultation;
	public Creneau() {}


	public Creneau(Long id, LocalDateTime debut, Integer duree, boolean dispo, Praticien praticien, Lieu lieu,
			Consultation consultation) {
		super();
		this.id = id;
		this.debut = debut;
		this.duree = duree;
		this.dispo = dispo;
		//this.praticien = praticien;
		this.lieu = lieu;
		this.consultation = consultation;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getDebut() {
		return debut;
	}

	public Integer getDuree() {
		return duree;
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDebut(LocalDateTime debut) {
		this.debut = debut;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}
	
	/*public Praticien getPraticien() {
		return praticien;
	}*/


	public Lieu getLieu() {
		return lieu;
	}


	public Consultation getConsultation() {
		return consultation;
	}


	/*public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}*/


	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}


	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}


	@Override
	public String toString() {
		return "Creneau [id=" + id + ", debut=" + debut + ", duree=" + duree + ", dispo=" + dispo + ", lieu=" + lieu
				+ ", consultation=" + consultation + "]";
	}

}
