package sopra.rdv4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.rdv4.model.Utilisateur;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
