package sopra.rdv4.model;

public class Lieu {
private Long id;
private String nom;
private String informations;

	public Lieu() {}

	public Lieu(Long id, String nom, String informations) {
		super();
		this.id = id;
		this.nom = nom;
		this.informations = informations;
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

	@Override
	public String toString() {
		return "Lieu [id=" + id + ", nom=" + nom + ", informations=" + informations + "]";
	}
	
	

}
