/**
 * 
 */
package exo6;

/**
 * Cette application permet de faire un compteur à l'aide de deux Thread, chacun
 * affichant les nombres pairs et impairs à tour de rôle.
 * 
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class PairImpair {

	private final static int MAX = 20; // limite d'affichage

	/**
	 * Classe privée qui affiche les nombres pair
	 * 
	 * @author VAREILLE-METAYER
	 * @since 28 nov. 2015
	 * @version 1.0
	 *
	 */
	private static class Pair extends Thread {
		private Compteur compteur;

		/**
		 * Constructeur, qui set le compteur
		 * 
		 * @param compteur
		 *            {@link Compteur}
		 */
		public Pair(Compteur compteur) {
			this.compteur = compteur;
		}

		/**
		 * Cette méthode attend si le nombre du compteur est impair, et affiche
		 * le nom du Thread, incrémente le compteur et affiche sa nouvelle
		 * valeur, avant de prévenir que le ocmpteur à été mis à jour
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
	 * Classe privée qui affiche les nombres impair
	 * 
	 * @author VAREILLE-METAYER
	 * @since 28 nov. 2015
	 * @version 1.0
	 *
	 */
	private static class Impair extends Thread {
		private Compteur compteur;

		/**
		 * Constructeur, qui set le compteur
		 * 
		 * @param compteur
		 *            {@link Compteur}
		 */
		public Impair(Compteur compteur) {
			this.compteur = compteur;
		}

		/**
		 * Cette méthode attend si le nombre du compteur est pair, et affiche le
		 * nom du Thread, incrémente le compteur et affiche sa nouvelle valeur,
		 * avant de prévenir que le ocmpteur à été mis à jour
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
	 * Point d'entrée de l'application, qui démarre les deux Thread
	 * 
	 * @param args
	 *            {@link String}
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
// java.lang.Integer, car il s'agit d'un objet immuable, donc pas de référence
// gardée, un nouvel objet est crée à chaque fois
