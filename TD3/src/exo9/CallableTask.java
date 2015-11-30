/**
 * 
 */
package exo9;

import java.util.concurrent.Callable;

/**
 * @author VAREILLE-METAYER
 * @since 27 nov. 2015
 * @version 1.0
 *
 */
public class CallableTask implements Callable<Task> {

	/**
	 * Constructeur
	 */
	public CallableTask() {
	}

	/**
	 * 
	 */
	@Override
	public Task call() throws Exception {
		for (int i = 0; i < 10; i++) {
			
		}
		return null;
	}

}
