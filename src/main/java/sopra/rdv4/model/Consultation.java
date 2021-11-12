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
public class Consultation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String instructions;
	@ManyToOne
	@JoinColumn(name="motif_id")
	private Motif motif;
	@OneToMany (mappedBy = "consultation")
	private List<Creneau> creneau;
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;

	public Consultation() {}

	public Consultation(Long id, String instructions, Motif motif, List<Creneau> creneau, Patient patient) {
		this.id = id;
		this.instructions = instructions;
		this.motif = motif;
		this.creneau = creneau;
		this.patient = patient;
	}

	public Long getId() {
		return id;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	public Motif getMotif() {
		return motif;
	}

	public List<Creneau> getCreneau() {
		return creneau;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setMotif(Motif motif) {
		this.motif = motif;
	}

	public void setCreneau(List<Creneau> creneau) {
		this.creneau = creneau;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Consultation [id=" + id + ", instructions=" + instructions + ", motif=" + motif + ", creneau=" + creneau
				+ ", patient=" + patient + "]";
	}

}
