package pattern.exo2.observateur;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Classe de test des {@link Observateur} et {@link Sujet}
 * 
 * @author Sylvain-Damien
 *
 */
public class TestObservateur {

	/**
	 * Point d'entrée de l'application qui va attacher à un capteur des instance
	 * d'observateur, et générer des données durant un certains temps.
	 * 
	 * @param args
	 *            {@link String}
	 */
	public static void main(String[] args) {
		Capteur c = new Capteur();

		Meteo meteo = new Meteo();
		Statistique statistique = new Statistique();
		Grapheur grapheur = new Grapheur();

		c.ajouterObservateur(meteo);

		ExecutorService executor = Executors.newFixedThreadPool(1);
		executor.submit(c);

		c.ajouterObservateur(statistique);
		c.ajouterObservateur(grapheur);

		try {
			Thread.sleep(Capteur.getSleep() * 30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executor.shutdownNow();
	}
}

/**
 * Réponses aux questions : <br>
 * Le capteur sera démarré par un executeur de service. <br>
 * On peut vérifier l'association dynamique en ajoutant un observateur après que
 * le Capteur soit démarré.
 */