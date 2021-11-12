package sopra.rdv4.model;

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
	
	
	public Praticien()
	{
		
	}
	
	public Praticien(Long id, String nom, String prenom, Civilite civilite, String telephone, Secteur secteur,
			Boolean carteVital, String photo, Boolean carteBancaire, Boolean cheque, Boolean espece,
			Integer dureeCreneau) {
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

	@Override
	public String toString() {
		return "Praticien [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", civilite=" + civilite + ", telephone="
				+ telephone + ", secteur=" + secteur + ", carteVital=" + carteVital + ", photo=" + photo
				+ ", carteBancaire=" + carteBancaire + ", cheque=" + cheque + ", espece=" + espece + ", dureeCreneau="
				+ dureeCreneau + "]";
	}
	
	
}
