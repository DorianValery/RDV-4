package sopra.rdv4.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.rdv4.model.Consultation;

public interface IPatientRepository {

	//Afficher les consultations par praticien
	@Query("select id.Consultation from Consultation c where c.id = :idPraticien")
	Consultation findByPraticienId(@Param("idPraticien") Long idPraticien); // par @Query
}
