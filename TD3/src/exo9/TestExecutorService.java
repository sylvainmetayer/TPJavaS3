/**
 * 
 */
package exo9;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author VAREILLE-METAYER
 * @since 27 nov. 2015
 * @version 1.0
 *
 */
public class TestExecutorService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(2);

		exec.submit(new Task());
		exec.submit(new Task());
		exec.submit(new Task());
		// Si l'on soumet 3 tâche, la troisième tache sera lancée que lorsque un
		// tache est finie, et que donc un emplacement dans le pool de Thread
		// est disponible

		exec.shutdown(); // on utilise

	}

}
