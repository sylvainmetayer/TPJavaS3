/**
 * 
 */
package exo3;

/**
 * @author Sylvain-Damien
 *
 */
public interface Visiteur {

	void visit(Fichier fichier);

	void visit(Repertoire repertoire);

	void beforeVisit(ComposantSysteme composant);

	void afterVisit(ComposantSysteme composant);

}
