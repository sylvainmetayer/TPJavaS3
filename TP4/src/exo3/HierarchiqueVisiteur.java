package exo3;

/**
 * @author Sylvain-Damien
 *
 */
public class HierarchiqueVisiteur implements Visiteur {

	private int indentation;

	public HierarchiqueVisiteur() {
		indentation = 0;
	}

	@Override
	public void visit(Fichier fichier) {
		System.out.println(indenter() + fichier.getNom());
	}

	@Override
	public void visit(Repertoire repertoire) {
		System.out.println(indenter() + repertoire.getNom());
	}

	@Override
	public void beforeVisit(ComposantSysteme composant) {
		System.out.println("PLUS PLUS");
		indentation++;
	}

	@Override
	public void afterVisit(ComposantSysteme composant) {
		System.out.println("MOINS MOINS");
		indentation--;
	}

	public String indenter() {
		String indenter = "";
		if (this.indentation > 1) {
			indenter += "\t";
		}
		return indenter;
	}

}
