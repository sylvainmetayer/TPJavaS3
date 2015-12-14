/**
 * 
 */
package exo1.adapteur;

/**
 * @author Sylvain
 *
 */
public interface File<T> {

	void ajouter(T t);

	T getTete();

	void supprimerTete();

	int longueur();

	boolean estVide();
}
