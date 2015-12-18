/**
 * 
 */
package exo1.adapteur;

/**
 * Interface déterminant les opérations possible sur une file. Cette classe est
 * générique, ce qui permet de créer des files de différent types.
 * 
 * @author Sylvain-Damien
 *
 */
public interface File<T> {

	/**
	 * Permet d'ajouter un element en queue de file.
	 * 
	 * @param t
	 *            générique
	 */
	void ajouter(T t);

	/**
	 * Retourne l'element en tête de file.
	 * 
	 * @return type générique
	 */
	T getTete();

	/**
	 * Permet de supprimer l'element en tête de file.
	 */
	void supprimerTete();

	/**
	 * Retourne la longueur de la file.
	 * 
	 * @return
	 */
	int longueur();

	/**
	 * Permet de savoir si la file est vide.
	 * 
	 * @return <code>true</code> si la file est vide, false sinon
	 */
	boolean estVide();
}
