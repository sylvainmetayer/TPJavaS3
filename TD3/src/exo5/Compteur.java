/**
 * 
 */
package exo5;

/**
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class Compteur {

	// private java.lang.Integer l;
	private long l;

	/**
	 * 
	 */
	public Compteur() {
		this.l = 0;
	}

	public synchronized long getL() {
		return this.l;
	}

	public synchronized void next() {
		this.l++;
	}
}
