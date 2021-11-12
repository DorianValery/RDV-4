package sopra.rdv4.model;

public class Consultation {
	private Long id;
	private String instructions;

	public Consultation() {}

	public Consultation(Long id, String instructions) {
		super();
		this.id = id;
		this.instructions = instructions;
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

	@Override
	public String toString() {
		return "Consultation [id=" + id + ", instructions=" + instructions + "]";
	}

}
