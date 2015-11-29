/**
 * 
 */
package exo3.arret;

/**
 * Cette application met en oeuvre la fermeture d'un thread "proprement".
 * 
 * @author VAREILLE-METAYER
 * @since 20 nov. 2015
 * @version 1.0
 */
public class TestArret {

	/**
	 * Point d'entrée de l'application
	 * 
	 * @param args
	 *            {@link String}
	 */
	public static void main(String[] args) {
		Task task = new Task();

		new Thread(task).start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		task.isStopeed(true);

	}

}

// Si l'on met un affichage des points toutes les 10_000s, on aura un temps
// d'attente (le Thread.sleep(10_000)) avant de repasser sur le test de
// isStopped dans la méthode run

// Il est nécessaire de synchroniser les méthodes setIsStopped et isStopped,
// pour éviter les accès concurrents