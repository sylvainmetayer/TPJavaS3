package pattern.exo2.observateur;

/**
 * @author Sylvain-Damien
 *
 */
public interface Sujet {

	void ajouterObservateur(Observateur o);

	void retirerObservateur(Observateur o);

	void notifierObervateur();
}
