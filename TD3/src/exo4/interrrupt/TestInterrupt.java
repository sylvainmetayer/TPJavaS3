/**
 * 
 */
package exo4.interrrupt;

/**
 * @author VAREILLE-METAYER
 * @since 20 nov. 2015
 * @version 1.0
 *
 */
public class TestInterrupt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new InterruptExo());
		t.start();

		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// interrupt.arreter(); //Ne fonctionne pas
		t.interrupt(); // fonctionne

	}

}

// Si l'on affiche un point toute les 10_000ms, on aura un seul point
// d'afficher, et on arretera directement le Thread, car le rty/catch contient
// le while qui affiche les points
