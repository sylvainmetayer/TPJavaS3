/**
 * 
 */
package exo8;

/**
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class LongAction {

	public LongAction() {
	}

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
