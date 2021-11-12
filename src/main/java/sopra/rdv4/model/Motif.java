package sopra.rdv4.model;

public class Motif {
 private Long id;
 private String nom;
 private int nbCreneau; 
 
	public Motif() {}

	public Motif(Long id, String nom, int nbCreneau) {
		super();
		this.id = id;
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

	@Override
	public String toString() {
		return "Motif [id=" + id + ", nom=" + nom + ", nbCreneau=" + nbCreneau + "]";
	}

}
