package exo4.interrrupt;

/**
 * Cette classe implémente l'interface Runnable.<br>
 * Elle permet d'afficher des points toutes les 200 ms, tant que le thread n'est pas interrompu.
 * @author VAREILLE-METAYER
 * @since 20 nov. 2015
 * @version 1.0
 */
public class InterruptExo implements Runnable {
	
	/**
	 * Constructeur de la classe faisant appel au constructeur parent.
	 */
	public InterruptExo() {
		super();
	}
	/**
	 * Affiche "." toutes les 200 ms, tant que le thread n'est pas interrompu
	 * @see java.lang.Thread
	 */
	@Override
	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				System.out.print(".");
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			System.out.println("Fin du Thread !");
			e.printStackTrace();
		}
	}

	// Utiliser la méthode interrupt directement sur le Thread, car la méthode
	// arreter ne fonctionne pas.

}
