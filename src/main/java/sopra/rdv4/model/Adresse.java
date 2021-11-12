package sopra.rdv4.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	@Column(name="voie", length = 255)
	private String voie;
	@Column(name="complement", length = 255)
	private String complement;
	@Column(name="codePostal", length = 255)
	private String codePostal;
	@Column(name="ville", length = 255)
	private String ville;
	

	public Adresse() {}

	public Adresse(String voie, String complement, String codePostal, String ville) {
		super();
		this.voie = voie;
		this.complement = complement;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public String getVoie() {
		return voie;
	}

	public String getComplement() {
		return complement;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [voie=" + voie + ", complement=" + complement + ", codePostal=" + codePostal + ", ville="
				+ ville + "]";
	}

}
