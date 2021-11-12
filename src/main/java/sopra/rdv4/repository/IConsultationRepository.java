package sopra.rdv4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.rdv4.model.Consultation;

public interface IConsultationRepository extends JpaRepository<Consultation, Long> {

}
