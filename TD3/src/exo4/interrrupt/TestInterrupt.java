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
		InterruptExo interrupt = new InterruptExo();

		new Thread(interrupt).start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		interrupt.arreter();

	}

}
