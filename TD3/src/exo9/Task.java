/**
 * 
 */
package exo9;

import java.util.Date;

/**
 * Classe qui implemente {@link Runnable} et qui permet de simuler le
 * fonctionnement d'une tâche.
 * 
 * @author VAREILLE-METAYER
 * @since 27 nov. 2015
 * @version 1.0
 *
 */
public class Task implements Runnable {

	/**
	 * Constructeur d'un objet Task
	 */
	public Task() {

	}

	/**
	 * Affiche le nom du Thread, et l'heure, avec un intervalle de 1 seconde
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Date heure = new Date();
			System.out.println(this);
			try {
				Thread.sleep(1_000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println(heure);
		}
		System.out.println("FIN THREAD");

	}
	// Ce n'est pas thread-safe, car l'affichage du nom du Thread et l'heure se
	// font dans un même thread.

	/**
	 * Retourne le nom du Thread
	 */
	@Override
	public String toString() {
		return Thread.currentThread().getName();
	}
}
