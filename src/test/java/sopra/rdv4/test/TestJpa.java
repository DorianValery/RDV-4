<<<<<<< Updated upstream:src/test/java/sopra/rdv4/test/TestJpa.java
package sopra.rdv4.test;
=======
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sopra.rdv4.config.ApplicationConfig;
import sopra.rdv4.repository.IConsultationRepository;
import sopra.rdv4.repository.IPatientRepository;
import sopra.rdv4.repository.IPraticienRepository;

>>>>>>> Stashed changes:src/test/java/TestJpa.java

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

		
		//Evaluation evalLea = new Evaluation(15, 13, "super délégué");

		//evalLea = evaluationRepo.save(evalLea);
		
		spring.close();

	}

}
