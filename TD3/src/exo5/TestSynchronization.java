/**
 * 
 */
package exo5;

/**
 * Cette application permet de synchroniser des threads lors d'accès
 * concurrents.
 * 
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 */
public class TestSynchronization {

	/**
	 * Cette classe privée étend la classe Thread.
	 * 
	 * @author VAREILLE-METAYER
	 * @since 27 nov. 2015
	 * @version 1.0
	 */
	private static class ConcurrentThread extends Thread {
		private Compteur compteur;

		/**
		 * Constructeur de la classe ConcurrentThread
		 * 
		 * @param Commpteur
		 *            c
		 */
		public ConcurrentThread(Compteur c) {
			this.compteur = c;
		}

		/**
		 * Appelle 10_000_000 la méthode run, afin de tester les accès
		 * concurrents
		 * 
		 * @see java.lang.Thread
		 */
		@Override
		public void run() {
			for (int i = 0; i < 1_000_000; i++) {
				this.compteur.next();
			}
		}
	}

	/**
	 * Point d'entrée de l'application
	 * 
	 * @param args
	 *            {@link String}
	 */
	public static void main(String[] args) {
		// Instanciation du tableau de Thread
		final Compteur compteur = new Compteur();
		final Thread thread[] = { new ConcurrentThread(compteur), new ConcurrentThread(compteur),
				new ConcurrentThread(compteur), new ConcurrentThread(compteur), new ConcurrentThread(compteur),
				new ConcurrentThread(compteur), new ConcurrentThread(compteur), new ConcurrentThread(compteur),
				new ConcurrentThread(compteur), new ConcurrentThread(compteur) };

		// Démarrage des Threads
		for (Thread threads : thread) {
			threads.start();
			try {
				threads.join(); // on attends qu'il soit tous terminé
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(compteur.getL());
	}

}
// Il faut joindre les threads afin d'être sur que tout les thread soient
// terminés et que le resultat final soit correct. Le programme n'est pas
// thread-safe car si le join n'est pas fait, ou que les méthodes ne sont pas
// synchronisées, le resultat ne sera peut etre pas correct.

// On peut le corriger en méttant les méthodes getL et next en synchronisées,
// afin d'être sur qu'elle ne soit accéder que par un Thread à la fois, évitant
// ainsi les accès concurrents