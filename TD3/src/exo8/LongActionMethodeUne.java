/**
 * 
 */
package exo8;

/**
 * Cette classe permet de faire un traitement long, sans gêner le Thread
 * d'affichage de l'interface graphique
 * 
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class LongActionMethodeUne extends Thread {

	/**
	 * Constructeur
	 */
	public LongActionMethodeUne() {
	}

	/**
	 * Appelle la méthode traitementLong
	 */
	@Override
	public void run() {
		traitementLong();
	}

	/**
	 * Traitement long, qui affiche 100 points par inervalle de 200ms
	 */
	public void traitementLong() {
		for (int i = 0; i < 100; i++) {
			System.out.print(".");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
