/**
 * 
 */
package exo4.interrrupt;

/**
 * Cette application permet d'interrompre un thread "proprement".
 * 
 * @author VAREILLE-METAYER
 * @since 20 nov. 2015
 * @version 1.0
 */
public class TestInterrupt {

	/**
	 * Point d'entrée de l'application
	 * 
	 * @param args
	 *            {@link String}
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new InterruptExo());
		t.start();

		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t.interrupt();

	}

}

// Si l'on affiche un point toute les 10_000ms, on aura un seul point
// d'affiché, et on arretera directement le Thread, car le try/catch contient
// le while qui affiche les points.
