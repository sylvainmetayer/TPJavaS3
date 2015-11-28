/**
 * 
 */
package exo2.Demon;

/**
 * Cette application met en oeuvre un thread Démon.
 * 
 * @author VAREILLE-METAYER
 * @since 27 nov. 2015
 * @version 1.0
 */
public class TestDemon {

	/**
	 * Point d'entrée de l'application
	 * 
	 * @param args
	 *            {@link String}
	 */
	public static void main(String[] args) {
		final Demon t = new Demon();
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Arrêt " + Thread.currentThread().getName());
	}
}
/*
 * Réponses aux questions : Dans le run() du démon, lorsque le bloc try est
 * terminé, on passe dans le finally qui affiche "Pas un démon". Lorsque le
 * thread est démon, celui-ci est arrêté lorsque le main s'arrête.
 */