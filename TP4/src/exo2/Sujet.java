/**
 * 
 */
package exo2;

/**
 * @author Sylvain-Damien
 *
 */
public interface Sujet {

	void ajouterObservateur(Observateur o);

	void retirerObservateur(Observateur o);

	void notifierObervateur();
}
