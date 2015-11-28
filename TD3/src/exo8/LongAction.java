/**
 * 
 */
package exo8;

/**
 * Classe qui bloque l'interface graphique, en faisant une opération longue.
 * 
 * @see TestLongAction pour voir l'appel
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class LongAction {

	/**
	 * Constructeur
	 */
	public LongAction() {
	}

	/**
	 * Cette méthode se contente d'afficher un point tout les 200ms, 100 fois.
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
