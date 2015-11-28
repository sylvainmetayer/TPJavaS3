/**
 * 
 */
package exo7;

import java.util.List;

/**
 * Classe qui simule le comportement d'un producteur de chaine
 * 
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class Producteur extends Thread {
	private List<String> strings;
	private final int SIZE;

	/**
	 * Constructeur, qui instancie une liste de chaine, et une taille maximum de
	 * chaine à produire
	 * 
	 * @param SIZE
	 * @param strings
	 * 
	 */
	public Producteur(int SIZE, List<String> strings) {
		this.strings = strings;
		this.SIZE = SIZE;
	}

	/**
	 * Méthode qui appelle continuellement la méthode produce
	 */
	@Override
	public void run() {
		while (true) {
			produce();
		}
	}

	/**
	 * Méthode qui regarde si la liste de chaine est pleine (supérieure à SIZE).
	 * Si elle ne l'est pas, on ajoute une chaine à la liste et on notifie que
	 * des nouvelles chaines sont disponibles.
	 */
	private void produce() {
		try {
			String val = "Production/Consommation en cours..";
			synchronized (strings) {
				while (strings.size() > this.SIZE) { // liste pleine
					strings.wait();
				}
				System.out.println(this.getName() + " a produit : " + val);
				strings.add(val);
				strings.notifyAll();
			}

			Thread.sleep(500); // 1000/2 = on produit deux fois plus vite
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
