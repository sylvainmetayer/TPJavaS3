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
public class Consommateur extends Thread {
	private List<String> strings;

	/**
	 * @param strings
	 * 
	 */
	public Consommateur(List<String> strings) {
		this.strings = strings;
	}

	@Override
	public void run() {
		while (true) {
			consommer();
		}
	}

	private void consommer() {
		String s = "";
		try {
			synchronized (strings) {

				while (strings.size() <= 0) {
					strings.wait();
				}
				s = strings.get(0);
				strings.remove(0);
				strings.notifyAll();

			}
			System.out.println(this.getName() + " consomme : " + s);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
