/**
 * 
 */
package exo6;

/**
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class PairImpair {

	private final static int MAX = 20; // limite d'affichage

	private static class Pair extends Thread {
		private Compteur compteur;

		public Pair() {
			this.compteur = new Compteur();
		}

		@Override
		public void run() {
			System.out.println("Début " + this.getName() + ", pair.");
			for (int i = 0; i < PairImpair.MAX; i++) {
				synchronized (compteur) {
					try {
						while (compteur.getL() % 2 != 0) { // si c'est impair
							compteur.wait();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						System.out.println(this.getName() + ", Compteur : " + this.compteur.getL() + ", i =" + i);
						compteur.next(); // on incrémente
						compteur.notifyAll(); // on notifie l'autre Thread
					}
				}
			}
		}
	}

	private static class Impair extends Thread {
		private Compteur compteur;

		public Impair() {
			this.compteur = new Compteur();
		}

		@Override
		public void run() {
			System.out.println("Début " + this.getName() + ", impair.");
			for (int i = 0; i < PairImpair.MAX; i++) {
				synchronized (compteur) {
					try {
						while (compteur.getL() % 2 == 0) { // si c'est pair
							compteur.wait();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						System.out.println(this.getName() + ", Compteur : " + this.compteur.getL() + ", i =" + i);
						compteur.next(); // on incrémente
						compteur.notifyAll(); // on notifie l'autre Thread
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		Thread pair = new Pair();
		Thread impair = new Impair();

		pair.start();
		impair.start();
	}

}
