package sopra.rdv4.model;

public class Utilisateur {

	private Long id;
	private String email;
	private String motDePasse;
	private Type type;
	
	
	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}
	


	public Utilisateur(Long id, String email, String motDePasse, Type type) {
		this.id = id;
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


	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", email=" + email + ", motDePasse=" + motDePasse + ", type=" + type + "]";
	}
	
	

}
