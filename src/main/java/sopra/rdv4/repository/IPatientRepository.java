package sopra.rdv4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.rdv4.model.Consultation;
import sopra.rdv4.model.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Long>  {

	//Afficher les consultations par praticien
	@Query("select id.Consultation from Consultation c where c.id = :idPraticien")
	Consultation findByPraticienId(@Param("idPraticien") Long idPraticien); // par @Query
}
