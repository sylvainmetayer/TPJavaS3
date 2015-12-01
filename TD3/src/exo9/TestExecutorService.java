/**
 * 
 */
package exo9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Classe de test qui permet de tester l'executeur de Service
 * 
 * @author VAREILLE-METAYER
 * @since 27 nov. 2015
 * @version 1.0
 *
 */
public class TestExecutorService {

	/**
	 * Point d'entrée de l'application
	 * 
	 * @param args
	 *            {@link String}
	 */
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(2);

		exec.submit(new Task());
		exec.submit(new Task());
		exec.submit(new Task());
		// Si l'on soumet 3 tâches, la troisième tache sera lancée que lorsque
		// un
		// tache est finie, et que donc un emplacement dans le pool de Thread
		// est disponible

		exec.shutdown();
		// exec.submit(new Task()); // la tâche n'est pas acceptée

		CallableTask mytask = new CallableTask();
		try {
			System.out.println("Callable task : " + mytask.call());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

// Pour afficher le résultat, on utilise la méthode call, qui retourne un
// Integer.