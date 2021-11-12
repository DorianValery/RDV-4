package sopra.rdv4.test;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sopra.rdv4.config.ApplicationConfig;
import sopra.rdv4.model.Adresse;
import sopra.rdv4.model.Civilite;
import sopra.rdv4.model.Consultation;
import sopra.rdv4.model.Creneau;
import sopra.rdv4.model.Lieu;
import sopra.rdv4.model.Motif;
import sopra.rdv4.model.Patient;
import sopra.rdv4.model.Praticien;
import sopra.rdv4.model.Secteur;
import sopra.rdv4.model.Specialite;
import sopra.rdv4.model.Type;
import sopra.rdv4.model.Utilisateur;
import sopra.rdv4.repository.IConsultationRepository;
import sopra.rdv4.repository.ICreneauRepository;
import sopra.rdv4.repository.ILieuRepository;
import sopra.rdv4.repository.IMotifRepository;
import sopra.rdv4.repository.IPatientRepository;
import sopra.rdv4.repository.IPraticienRepository;
import sopra.rdv4.repository.ISpecialiteRepository;
import sopra.rdv4.repository.IUtilisateurRepository;


public class TestJpa {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		IConsultationRepository consultationRepo = spring.getBean(IConsultationRepository.class);
		ICreneauRepository creneauRepo = spring.getBean(ICreneauRepository.class);
		ILieuRepository lieuRepo = spring.getBean(ILieuRepository.class);
		IMotifRepository motifRepo = spring.getBean(IMotifRepository.class);
		IPatientRepository patientRepo = spring.getBean(IPatientRepository.class);
		IPraticienRepository praticienRepo = spring.getBean(IPraticienRepository.class);
		ISpecialiteRepository specialiteRepo = spring.getBean(ISpecialiteRepository.class);
		IUtilisateurRepository utilisateurRepo = spring.getBean(IUtilisateurRepository.class);

		
		
		Utilisateur comptePraticien = new Utilisateur();
		
		comptePraticien.setEmail("doc1@gmail.com");
		comptePraticien.setMotDePasse("doc1");
		comptePraticien.setType(Type.PRATICIEN);
		
		comptePraticien = utilisateurRepo.save(comptePraticien);
		

		Utilisateur comptePatient1 = new Utilisateur();
		
		comptePatient1.setEmail("patient1@gmail.com");
		comptePatient1.setMotDePasse("patient1");
		comptePatient1.setType(Type.PATIENT);
		
		comptePatient1 = utilisateurRepo.save(comptePatient1);
		
		
		Praticien praticien = new Praticien();
		
		praticien.setNom("Maboul");
		praticien.setPrenom("Didier");
		praticien.setCivilite(Civilite.M);
		praticien.setTelephone("0665256869");
		praticien.setSecteur(Secteur.SECTEUR_1);
		praticien.setPhoto(null);
		praticien.setCarteBancaire(null);
		praticien.setCarteVital(null);
		praticien.setEspece(null);
		praticien.setCheque(null);
		praticien.setDureeCreneau(15);
		
		praticien = praticienRepo.save(praticien);
		
		
		Patient patient1 = new Patient();
		
		patient1.setCivilite(Civilite.M);
		patient1.setDtNaissance(LocalDate.parse("1995-05-05"));
		patient1.setEmail("patient1@gmail.com");
		patient1.setNom("Pasbien");
		patient1.setPrenom("Jesuis");
		patient1.setPrincipal(false);
		patient1.setTelephone("0648591526");
		
		patient1 = patientRepo.save(patient1);
		
		Adresse adresse = new Adresse();
		
		adresse.setCodePostal("75001");
		adresse.setComplement("15");
		adresse.setVille("Paris");
		adresse.setVoie("rue du Temple");
		
		//adresse = adresseRepo.save(adresse);
		
		Lieu lieu = new Lieu("Cabinet LaPorte","Sonnez avant d'entrée");
		lieu = lieuRepo.save(lieu);
		
		Creneau creneau = new Creneau(LocalDateTime.parse("2021-05-05T10:30:00"),15,true);
		creneau = creneauRepo.save(creneau);
		
		Specialite specialite = new Specialite("Radiologue");
		specialite = specialiteRepo.save(specialite);
		
		Motif motif = new Motif("Fracture",2);
		motif = motifRepo.save(motif);
		
		
		
		Consultation consultation = new Consultation();
		consultation.setInstructions("Merci de vous munir d'un masque");
		consultation = consultationRepo.save(consultation);
		
		motif.setSpecialite(specialite);
		specialite.setPraticien(praticien);
		creneau.setConsultation(consultation);
		creneau.setLieu(lieu);
		creneau.setPraticien(praticien);
		lieu.setAdresse(adresse);
		
		lieu.setPraticien(praticien);
		patient1.setAdresse(adresse);
		patient1.setUtilisateur(comptePatient1);
		praticien.setUtilisateur(comptePraticien);
		
		
		
		comptePraticien = utilisateurRepo.save(comptePraticien);
		comptePatient1 = utilisateurRepo.save(comptePatient1);
		praticien = praticienRepo.save(praticien);
		patient1 = patientRepo.save(patient1);
		lieu = lieuRepo.save(lieu);
		creneau = creneauRepo.save(creneau);
		specialite = specialiteRepo.save(specialite);
		motif = motifRepo.save(motif);
		consultation = consultationRepo.save(consultation);

		
		
		
		
		spring.close();

	}

}
