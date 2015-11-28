/**
 * 
 */
package exo7;

import java.util.List;

/**
 * Classe qui simule le comportement d'un consommateur.
 * 
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class Consommateur extends Thread {
	private List<String> strings;

	/**
	 * Constructeur, qui sette la liste de Chaine
	 * 
	 * @param strings
	 * 
	 */
	public Consommateur(List<String> strings) {
		this.strings = strings;
	}

	/**
	 * Méthode qui appelle continuellement la méthode consommer
	 */
	@Override
	public void run() {
		while (true) {
			consommer();
		}
	}

	/**
	 * Méthode qui regarde si des chaines sont présentes dans la liste. Si oui,
	 * on retire la chaine, et on l'affiche avec le nom du Thread. Sinon, on
	 * attends.
	 */
	private void consommer() {
		String s = "";
		try {
			synchronized (strings) {

				while (strings.size() <= 0) { // si pas de chaine dans la liste
					strings.wait();
				}
				s = strings.get(0);
				strings.remove(0);
				strings.notifyAll();
			}
			System.out.println(this.getName() + " a consommé : " + s);
			Thread.sleep(1000); // 2*500, le producteur produit plus vite que le
								// consommateur
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
