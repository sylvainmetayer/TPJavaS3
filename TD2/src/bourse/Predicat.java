/**
 * 
 */
package bourse;

/**
 * Interface permettant de définir la condition d'un test. <br>
 * A utiliser en combinaison de Filter pour filtrer une liste d'elements
 * 
 * @author VAREILLE-METAYER
 * @since 19 nov. 2015
 * @version 1.0
 * @see Filter
 */
public interface Predicat<T> {

	/**
	 * Méthode permettant de définir une condition de test.
	 * 
	 * @param t
	 *            objet de type générique.
	 * @return <code>true</code> ou <code>false</code> selon que la condition
	 *         est validée ou non.
	 */
	boolean test(T t);
}
