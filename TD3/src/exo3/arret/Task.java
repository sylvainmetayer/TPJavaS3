/**
 * 
 */
package exo3.arret;

/**
 * Classe qui simule le comportement d'une tâche. <br>
 * Elle se contente d'afficher des points, par intervalle de 200ms, et qui
 * s'arrête lorsque le booleen est <code>true</code>
 * 
 * @author VAREILLE-METAYER
 * @since 20 nov. 2015
 * @version 1.0
 *
 */
public class Task implements Runnable {

	/**
	 * Ce booléen permet de savoir si la tâche est arretée ou non.
	 */
	private boolean isStopped;

	/**
	 * Constructeur, qui initialise le booleen à faux (non arreté)
	 */
	public Task() {
		this.isStopped = false;
	}

	/**
	 * Rédéfinition de run, qui affiche un point toutes les 200ms, tant que le
	 * booleen est faux
	 */
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

	/**
	 * Méthode <b>synchronisée</b> qui permet de définir l'état du
	 * {@link Thread}
	 * 
	 * @param isStopped
	 *            {@link Boolean}
	 */
	public synchronized void isStopeed(boolean isStopped) {
		this.isStopped = isStopped;
	}

	/**
	 * Méthode <b>synchronisée</b> qui permet de savoir l'état du Thread
	 * 
	 * @return isStopped
	 * 				{@link Booleann}
	 */
	public synchronized boolean isStopped() {
		return this.isStopped;
	}

}
