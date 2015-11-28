/**
 * 
 */
package exercice1.realisation;

/**
 * Cette classe étend la classe Thread, et son nom.
 * 
 * @author VAREILLE-METAYER
 * @since 20 nov. 2015
 * @version 1.0
 */
public class WhoIsThread extends Thread {

	/**
	 * Constructeur de la classe WhoIsThread
	 */
	public WhoIsThread() {
	}

	/**
	 * Méthode qui affiche le nom du Thread 20 fois, par intervalle de 500ms
	 * 
	 * @see java.lang.Thread
	 */
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(this);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
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
