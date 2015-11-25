/**
 * 
 */
package exo7;

import java.util.List;

/**
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class Producteur extends Thread {
	private List<String> strings;
	private final int SIZE;

	/**
	 * @param SIZE
	 * @param strings
	 * 
	 */
	public Producteur(int SIZE, List<String> strings) {
		this.strings = strings;
		this.SIZE = SIZE;
	}

	@Override
	public void run() {
		while (true) {
			produce();
		}
	}

	/**
	 * 
	 */
	private void produce() {
		try {
			String val = "Super production !";
			synchronized (strings) {
				while (strings.size() > this.SIZE) {
					strings.wait();
				}
				System.out.println(this.getName() + " produit : " + val);
				strings.add(val);
				strings.notifyAll();
			}

			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
