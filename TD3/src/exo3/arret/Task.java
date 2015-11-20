/**
 * 
 */
package exo3.arret;

/**
 * @author VAREILLE-METAYER
 * @since 20 nov. 2015
 * @version 1.0
 *
 */
public class Task implements Runnable {

	private boolean isStopped;

	public Task() {
		this.isStopped = false;
	}

	@Override
	public void run() {
		while (!this.isStopped()) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void isStopeed(boolean isStopped) {
		this.isStopped = isStopped;
	}

	public synchronized boolean isStopped() {
		return this.isStopped;
	}

}
