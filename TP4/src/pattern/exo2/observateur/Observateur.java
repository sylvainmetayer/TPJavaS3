package pattern.exo2.observateur;

/**
 * Interface montrant les opération possible pour un {@link Observateur}. Un
 * {@link Observateur} observe un {@link Sujet}
 * 
 * @author Sylvain-Damien
 *
 */
public interface Observateur {

	/**
	 * Permet de modifier une données reçue, de la traiter par l'observateur.
	 * 
	 * @param d
	 *            {@link Donnee} à traiter.
	 */
	void modifier(Donnee d);
}
