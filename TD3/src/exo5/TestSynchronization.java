/**
 * 
 */
package exo5;

/**
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class TestSynchronization {

	private static class ConcurrentThread extends Thread {
		private Compteur compteur;

		public ConcurrentThread(Compteur c) {
			this.compteur = c;
		}

		@Override
		public void run() {
			for (int i = 0; i < 1_000_000; i++) {
				this.compteur.next();
			}
		}
	}

	public static void main(String[] args) {
		final Compteur compteur = new Compteur();
		final Thread thread[] = { new ConcurrentThread(compteur), new ConcurrentThread(compteur),
				new ConcurrentThread(compteur), new ConcurrentThread(compteur), new ConcurrentThread(compteur),
				new ConcurrentThread(compteur), new ConcurrentThread(compteur), new ConcurrentThread(compteur),
				new ConcurrentThread(compteur), new ConcurrentThread(compteur) };

		for (Thread threads : thread) {
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
