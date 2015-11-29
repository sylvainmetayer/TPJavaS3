/**
 * 
 */
package exo6;

/**
 * Cette application permet de lancer deux threads qui communiquent <br>
 * affichant pour l'un les nombres pairs, et pour l'autre les impairs.
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class PairImpair {

	private final static int MAX = 20; // limite d'affichage
	/**
	 * Classe statique qui étend la classe Thread, permettant de gérer les nombres pairs.
	 * @author VAREILLE-METAYER
	 * @since 29 nov. 2015
	 * @version 1.0
	 */
	private static class Pair extends Thread {
		private Compteur compteur;
		/**
		 * Constructeur d'un objet Pair.
		 * @param compteur
		 */
		public Pair(Compteur compteur) {
			this.compteur = compteur;
		}
		/**
		 * Méthode <b>synchronisée<b> permettant d'afficher les nombres pairs.<br>
		 * Si le nombre est impair, on attend, en notifiant le thread impair.
		 * @see java.lang.Thread
		 */
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
						System.out.println(this.getName() + ", Compteur : " + this.compteur.getL());
						compteur.next(); // on incrémente
						compteur.notifyAll(); // on notifie l'autre Thread
					}
				}
			}
		}
	}
	/**
	 * Classe statique qui étend la classe Thread, permettant de gérer les nombres impairs.
	 * @author VAREILLE-METAYER
	 * @since 29 nov. 2015
	 * @version 1.0
	 */
	private static class Impair extends Thread {
		private Compteur compteur;
		/**
		 * Constructeur d'un objet Impair.
		 * @param compteur
		 */
		public Impair(Compteur compteur) {
			this.compteur = compteur;
		}
		/**
		 * Méthode <b>synchronisée<b> permettant d'afficher les nombres impairs.<br>
		 * Si le nombre est pair, on attend, en notifiant le thread pair.
		 * @see java.lang.Thread
		 */
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
						System.out.println(this.getName() + ", Compteur : " + this.compteur.getL());
						compteur.next(); // on incrémente
						compteur.notifyAll(); // on notifie l'autre Thread
					}
				}
			}
		}
	}
	/**
	 * @param args
	 * 			{@link String}
	 */
	public static void main(String[] args) {

		final Compteur compteur = new Compteur();
		Thread pair = new Pair(compteur);
		Thread impair = new Impair(compteur);

		pair.start();
		impair.start();
	}

}

// Question : Non, il n'est pas possible d'utiliser une instance de la classe
// java.lang.Integer. //TODO justifer
