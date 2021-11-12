package sopra.rdv4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.rdv4.model.Praticien;

public interface IPraticienRepository extends JpaRepository<Praticien, Long>  {

	List <Praticien> findByNom (String nom);
	
	@Query("from Praticien p join p.specialites s where s.nom=:nom")
	List <Praticien> findBySpecialiteNom (@Param("nom") String nom);
	
	@Query("from Praticien p join p.lieux l where l.ville like '%:ville%'")
	List <Praticien> findByVille (@Param("ville") String ville);
}
