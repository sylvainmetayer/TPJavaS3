/**
 * 
 */
package exercice1.realisation;

/**
 * Cette application met en oeuvre un thread, affichant son nom.
 * @author VAREILLE-METAYER
 * @since 20 nov. 2015
 * @version 1.0
 */
public class TestWhoIsThread {

	/**
	 * Point d'entrée de l'application
	 * @param args
	 * 			{@link String}
	 */
	public static void main(String[] args) {
		final WhoIsThread t = new WhoIsThread();
		t.start();
		new WhoIsThread().start();
	}

}
