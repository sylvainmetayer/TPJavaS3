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
public class InterruptExo implements Runnable {

	public InterruptExo() {
		super();
	}

	@Override
	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				System.out.print(".");
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void arreter() {
		System.out.println("TOTO"); //TODO fix bug
		Thread.currentThread().interrupt();
	}

}
