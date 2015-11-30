package exo6;

/**
 * Cette classe simule un compteur
 * 
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 */
public class Compteur {

	private long l;

	/**
	 * Constructeur, qui initialise le compteur à 0
	 */
	public Compteur() {
		this.l = 0;
	}

	/**
	 * Méthode <b>synchronisée</b> qui permet de retourner la valeur du compteur
	 * 
	 * @return {@link Long}
	 */
	public synchronized long getL() {
		return this.l;
	}

	/**
	 * Méthode <b>synchronisée</b> qui permet d'incrémenter le compteur
	 */
	public synchronized void next() {
		this.l++;
	}
}
