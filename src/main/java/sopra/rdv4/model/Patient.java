package sopra.rdv4.model;

import java.time.LocalDate;
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
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Civilite civilite;
	private String nom;
	private String prenom;
	private String telephone;
	private LocalDate dtNaissance;
	private String email;
	private boolean principal;
	@OneToMany(mappedBy="patient")
	private List<Consultation> consultation;
	@Embedded
	private Adresse adresse;
	@ManyToOne
	@JoinColumn(name="utilisateurs_id")
	private Utilisateur utilisateur;
	
	public Patient() {}

	public Patient(Long id, Civilite civilite, String nom, String prenom, String telephone, LocalDate dtNaissance,
			String email, boolean principal) {
		super();
		this.id = id;
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.dtNaissance = dtNaissance;
		this.email = email;
		this.principal = principal;
	}

	public Long getId() {
		return id;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public LocalDate getDtNaissance() {
		return dtNaissance;
	}

	public String getEmail() {
		return email;
	}

	public boolean isPrincipal() {
		return principal;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setDtNaissance(LocalDate dtNaissance) {
		this.dtNaissance = dtNaissance;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom + ", telephone="
				+ telephone + ", dtNaissance=" + dtNaissance + ", email=" + email + ", principal=" + principal + "]";
	}
	
	

}
