package sopra.rdv4.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Praticien {

	private Long id;
	private String nom;
	private String prenom;
	private Civilite civilite;
	private String telephone;
	private Secteur secteur;
	private Boolean carteVital;
	private String photo;
	private Boolean carteBancaire;
	private Boolean cheque;
	private Boolean espece;
	private Integer dureeCreneau;
	@OneToOne
	private Utilisateur utilisateur;
	@OneToMany(mappedBy="praticien")
	private List<Specialite> specialites;
	@OneToMany(mappedBy="praticien")
	private List<Creneau>creneaux;
	@OneToMany(mappedBy="praticien")
	private List<Lieu> lieux;
	
	public Praticien(){}
	
	public Praticien(Long id, String nom, String prenom, Civilite civilite, String telephone, Secteur secteur,
			Boolean carteVital, String photo, Boolean carteBancaire, Boolean cheque, Boolean espece,
			Integer dureeCreneau, Utilisateur utilisateur, List<Specialite> specialites, List<Creneau> creneaux,
			List<Lieu> lieux) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.telephone = telephone;
		this.secteur = secteur;
		this.carteVital = carteVital;
		this.photo = photo;
		this.carteBancaire = carteBancaire;
		this.cheque = cheque;
		this.espece = espece;
		this.dureeCreneau = dureeCreneau;
		this.utilisateur = utilisateur;
		this.specialites = specialites;
		this.creneaux = creneaux;
		this.lieux = lieux;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Secteur getSecteur() {
		return secteur;
	}

	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}

	public Boolean getCarteVital() {
		return carteVital;
	}

	public void setCarteVital(Boolean carteVital) {
		this.carteVital = carteVital;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Boolean getCarteBancaire() {
		return carteBancaire;
	}

	public void setCarteBancaire(Boolean carteBancaire) {
		this.carteBancaire = carteBancaire;
	}

	public Boolean getCheque() {
		return cheque;
	}

	public void setCheque(Boolean cheque) {
		this.cheque = cheque;
	}

	public Boolean getEspece() {
		return espece;
	}

	public void setEspece(Boolean espece) {
		this.espece = espece;
	}

	public Integer getDureeCreneau() {
		return dureeCreneau;
	}

	public void setDureeCreneau(Integer dureeCreneau) {
		this.dureeCreneau = dureeCreneau;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public List<Specialite> getSpecialites() {
		return specialites;
	}

	public List<Creneau> getCreneaux() {
		return creneaux;
	}

	public List<Lieu> getLieux() {
		return lieux;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public void setSpecialites(List<Specialite> specialites) {
		this.specialites = specialites;
	}

	public void setCreneaux(List<Creneau> creneaux) {
		this.creneaux = creneaux;
	}

	public void setLieux(List<Lieu> lieux) {
		this.lieux = lieux;
	}

	@Override
	public String toString() {
		return "Praticien [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", civilite=" + civilite + ", telephone="
				+ telephone + ", secteur=" + secteur + ", carteVital=" + carteVital + ", photo=" + photo
				+ ", carteBancaire=" + carteBancaire + ", cheque=" + cheque + ", espece=" + espece + ", dureeCreneau="
				+ dureeCreneau + ", utilisateur=" + utilisateur + ", specialites=" + specialites + ", creneaux="
				+ creneaux + ", lieux=" + lieux + "]";
	}

}
