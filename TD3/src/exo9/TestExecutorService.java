/**
 * 
 */
package exo9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


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
		Thread t1 = new Thread(new Task());
		Thread t2 = new Thread(new Task());
		Thread t3 = new Thread(new Task());
		exec.submit(t1);
		exec.submit(t2);
		exec.submit(t3);
	}

}
