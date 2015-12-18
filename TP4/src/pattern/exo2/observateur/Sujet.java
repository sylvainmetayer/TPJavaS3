package pattern.exo2.observateur;

/**
 * Interface représentant les méthodes à disposition d'un sujet.
 * 
 * @author Sylvain-Damien
 *
 */
public interface Sujet {

	/**
	 * Permet l'ajout d'un observateur, en controlant que ce dernier ne soit pas
	 * <code>null</code>.
	 * 
	 * @param o
	 *            {@link Observateur}. L'observateur à ajouter sur le sujet.
	 */
	void ajouterObservateur(Observateur o);

	/**
	 * Permet l'ajout d'un observateur, en controlant que ce dernier soit
	 * présent dans les observateur déjà ajoutés.
	 * 
	 * @param o
	 *            {@link Observateur}. L'observateur à retirer sur le sujet.
	 */
	void retirerObservateur(Observateur o);

	/**
	 * Permet de notifier tous les {@link Observateur} afin qu'il effectue une
	 * MAJ de leur données.
	 */
	void notifierObervateur();
}
