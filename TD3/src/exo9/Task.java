/**
 * 
 */
package exo9;

import java.util.Date;

/**
 * @author VAREILLE-METAYER
 * @since 27 nov. 2015
 * @version 1.0
 *
 */
public class Task implements Runnable {

	/**
	 * 
	 */
	public Task() {

	}

	/*
	 * (non-Javadoc)
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

	}
	// Ce n'est pas thread-safe, car l'affichage du nom du Thread et l'heure se
	// font dans un même thread.

	@Override
	public String toString() {
		return Thread.currentThread().getName();
	}
}
