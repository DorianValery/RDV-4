package sopra.rdv4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.rdv4.model.Lieu;

public interface ILieuRepository extends JpaRepository<Lieu, Long> {

	//Afficher les praticiens par lieu de consultation
//	@Query("select idPraticien P from Lieu L  where P.id = :L.id")
//	Lieu findByLieuId(@Param("idPraticien") Long idPraticien); // par @Query

}
