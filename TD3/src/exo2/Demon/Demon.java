/**
 * 
 */
package exo2.Demon;

/**
 * Cette classe étend la classe Thread, et crée un Thread Démon afin de
 * comprendre la différence par rapport à un Thread classique
 * 
 * @author VAREILLE-METAYER
 * @since 27 nov. 2015
 * @version 1.0
 */
public class Demon extends Thread {

	/**
	 * Constructeur
	 */
	public Demon() {
		setDaemon(true);
	}

	/**
	 * Affiche 20 fois le nom du Thread, par intervalle de 500ms
	 * 
	 * @see java.lang.Thread
	 */
	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println(this);
				try {
					Thread.sleep(500);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		} finally { // Lorsqu'on a fait 20 tours de boucle
			System.out.println("Pas un démon");
		}
	}

	/**
	 * Retourne le nom du Thread courant
	 * 
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return Thread.currentThread().getName();
	}

}
