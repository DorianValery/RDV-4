package sopra.rdv4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.rdv4.model.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Long>  {

}
