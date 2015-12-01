/**
 * 
 */
package exo9;

import java.util.concurrent.Callable;

/**
 * @author VAREILLE-METAYER
 * @since 27 nov. 2015
 * @version 1.0
 *
 */
public class CallableTask implements Callable<Integer> {

	private int compteur;

	/**
	 * Constructeur d'un objet CallableTask
	 */
	public CallableTask() {
	}

	/**
	 * Cette méthode incrémente un compteur 10 fois toutes les 1_000 ms, puis
	 * retourne le résultat
	 * 
	 * @see java.util.concurrent.Callable
	 */
	@Override
	public Integer call() throws Exception {
		compteur = 0;
		for (int i = 0; i < 10; i++) {
			compteur++;
			try {
				Thread.sleep(1_000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		return compteur;
	}

}
