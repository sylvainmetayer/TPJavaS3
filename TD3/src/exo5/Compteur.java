/**
 * 
 */
package exo5;

/**
 * Cette classe permet de fabriquer un compteur, caractérisé par une variable<br>
 * d'instance l.
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 */
public class Compteur {

	// private java.lang.Integer l;
	private long l;

	/**
	 * Constructeur du compteur<br>
	 * La variable d'instance l est initialisée à 0.
	 */
	public Compteur() {
		this.l = 0;
	}
	/**
	 * Méthode <b>synchronisée</b> qui retourne la valeur de l
	 * @return l
	 */
	public synchronized long getL() {
		return this.l;
	}
	
	/**
	 * Méthode <b>synchronisée<b> qui incrémente la varibale d'instance l
	 */
	public synchronized void next() {
		this.l++;
	}
}
