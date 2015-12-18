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
		// beforeVisit(fichier);
		for (int i = 0; i < indentation; i++) {
			System.out.println("\t");
		}
		System.out.println(fichier.getNom());
		// afterVisit(fichier);
	}

	@Override
	public void visit(Repertoire repertoire) {
		// beforeVisit(repertoire);
		for (int i = 0; i < indentation - 1; i++) {
			System.out.println("\t");
		}
		System.out.println("\\-----");
		System.out.println(repertoire.getNom());

		// afterVisit(repertoire);
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

}
