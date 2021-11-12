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
public class Specialite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	@ManyToOne
	@JoinColumn(name="praticien_id")
	private Praticien praticien;
	@OneToMany(mappedBy="specialites")
	private List<Motif> motif;
	
	public Specialite() {
		// TODO Auto-generated constructor stub
	}

	public Specialite(Long id, String nom, Praticien praticien, List<Motif> motifs) {
		super();
		this.id = id;
		this.nom = nom;
		this.praticien = praticien;
		this.motif = motif;
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

	public Praticien getPraticien() {
		return praticien;
	}

	public List<Motif> getMotifs() {
		return motif;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public void setMotifs(List<Motif> motifs) {
		this.motif = motifs;
	}

	@Override
	public String toString() {
		return "Specialite [id=" + id + ", nom=" + nom + ", motifs=" + motif + "]";
	}
		
	
}
