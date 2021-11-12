package sopra.rdv4.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String motDePasse;
	private Type type;
	@OneToOne(mappedBy="utilisateur") 
	private Praticien praticien;
	@OneToMany(mappedBy="utilisateur")
	private List <Patient> patient;

	
	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}
	


	public Utilisateur(Long id, String email, String motDePasse, Type type) {
		this.id = id;
		this.email = email;
		this.motDePasse = motDePasse;
		this.type = type;
	}
	
	



	public Utilisateur(String email, String motDePasse, Type type) {
		this.email = email;
		this.motDePasse = motDePasse;
		this.type = type;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	
	public Praticien getPraticien() {
		return praticien;
	}



	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}



	public List<Patient> getPatient() {
		return patient;
	}



	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}



	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", email=" + email + ", motDePasse=" + motDePasse + ", type=" + type + "]";
	}
	
	

}
