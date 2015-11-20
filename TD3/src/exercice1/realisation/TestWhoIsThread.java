/**
 * 
 */
package exercice1.realisation;

/**
 * @author VAREILLE-METAYER
 * @since 20 nov. 2015
 * @version 1.0
 *
 */
public class TestWhoIsThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final WhoIsThread t = new WhoIsThread();
		t.start();
		new WhoIsThread().start();
	}

}
