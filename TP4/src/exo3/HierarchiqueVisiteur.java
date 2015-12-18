/**
 * 
 */
package exo3;

/**
 * @author Sylvain-Damien
 *
 */
public class HierarchiqueVisiteur implements Visiteur {

	public HierarchiqueVisiteur() {

	}

	@Override
	public void visit(Fichier fichier) {
		System.out.println(fichier.getNom());
	}

	@Override
	public void visit(Repertoire repertoire) {
		System.out.println(repertoire.getNom());
	}

	@Override
	public void beforeVisit(ComposantSysteme composant) {

	}

	@Override
	public void afterVisit(ComposantSysteme composant) {

	}

}
