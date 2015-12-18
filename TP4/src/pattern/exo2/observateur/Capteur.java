/**
 * 
 */
package pattern.exo2.observateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe répreentant un capteur qui implémente {@link Sujet}. Cela permet
 * d'ajouter des {@link Observateur} à ce sujet. Génère également des données
 * aléatoires.
 * 
 * @author Sylvain-Damien
 *
 */
public class Capteur implements Runnable, Sujet {

	private List<Observateur> observateurs;
	private Donnee donnee;
	private final static int SLEEP = 500;

	/**
	 * Retourne la durée entre deux notifications.
	 * 
	 * @return {@link Integer}
	 */
	public static int getSleep() {
		return SLEEP;
	}

	/**
	 * Constructeur, qui instancie une nouvelle liste d'Observateurs.
	 */
	public Capteur() {
		this.observateurs = new ArrayList<>();
	}

	@Override
	public void ajouterObservateur(Observateur o) {
		if (o == null)
			throw new NullPointerException("L'observateur fourni est nul.");
		this.observateurs.add(o);
	}

	@Override
	public void retirerObservateur(Observateur o) {
		if (!observateurs.contains(o))
			throw new IllegalStateException("Le sujet ne comporte pas cet observateur !");
		this.observateurs.remove(o);

	}

	@Override
	public void notifierObervateur() {
		for (Observateur o : observateurs) {
			o.modifier(donnee);
		}
	}

	/**
	 * Génère des données aléatoire et avertit les utilisateur toutes les
	 * {@link Capteur#SLEEP} ms.
	 */
	@Override
	public void run() {
		try {
			Random r = new Random();
			while (true) {
				this.donnee = new Donnee(r.nextDouble() * 100, r.nextDouble() * 100, r.nextDouble() * 100);

				notifierObervateur();
				Thread.sleep(SLEEP);
			}
		} catch (InterruptedException e) {
			System.out.println("Fin du Thread\n" + e);
		}
	}

}
