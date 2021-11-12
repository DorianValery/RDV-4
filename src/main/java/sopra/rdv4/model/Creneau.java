package sopra.rdv4.model;

import java.time.LocalDateTime;

public class Creneau {
private Long id;
private LocalDateTime debut;
private Integer duree;
private boolean dispo;
	
	public Creneau() {}

	public Creneau(Long id, LocalDateTime debut, Integer duree, boolean dispo) {
		super();
		this.id = id;
		this.debut = debut;
		this.duree = duree;
		this.dispo = dispo;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getDebut() {
		return debut;
	}

	public Integer getDuree() {
		return duree;
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDebut(LocalDateTime debut) {
		this.debut = debut;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

	@Override
	public String toString() {
		return "Creneau [id=" + id + ", debut=" + debut + ", duree=" + duree + ", dispo=" + dispo + "]";
	}
	

}
