package sopra.rdv4.model;

public class Specialite {

	private Long id;
	private String nom;
	
	public Specialite() {
		// TODO Auto-generated constructor stub
	}

	public Specialite(Long id, String nom) {
		this.id = id;
		this.nom = nom;
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

	@Override
	public String toString() {
		return "Specialite [id=" + id + ", nom=" + nom + "]";
	}

	
}
