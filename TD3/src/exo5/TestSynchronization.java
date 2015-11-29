/**
 * 
 */
package exo5;

/**
 * Cette application permet de synchroniser des threads lors d'accès concurrents.
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 */
public class TestSynchronization {

	/**
	 * Cette classe étend la classe Thread.
	 * @author VAREILLE-METAYER
	 * @since 27 nov. 2015
	 * @version 1.0
	 */
	private static class ConcurrentThread extends Thread {
		private Compteur compteur;
		
		/**
		 * Constructeur de la classe ConcurrentThread
		 * @param Commpteur c
		 */
		public ConcurrentThread(Compteur c) {
			this.compteur = c;
		}
		/**
		 * Méthode qui incrémente le compteur 1 000 000 de fois
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
	 * @param args
	 * 			{@link String}
	 */
	public static void main(String[] args) {
		final Compteur compteur = new Compteur();
		final Thread thread[] = { new ConcurrentThread(compteur), new ConcurrentThread(compteur),
				new ConcurrentThread(compteur), new ConcurrentThread(compteur), new ConcurrentThread(compteur),
				new ConcurrentThread(compteur), new ConcurrentThread(compteur), new ConcurrentThread(compteur),
				new ConcurrentThread(compteur), new ConcurrentThread(compteur) };

		for (Thread threads : thread) { //on démarre chaque thread
			threads.start();
			try {
				threads.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(compteur.getL());
	}

}
// Il faut joindre les threads afin d'être sur que tout les thread soient
// terminés et que le resultat final soit correct. Le programme n'est pas
// thread-safe car si le join n'est pas fait, le resultat ne sera peut etre pas
// correct.

// Comment le corriger ? TODO
