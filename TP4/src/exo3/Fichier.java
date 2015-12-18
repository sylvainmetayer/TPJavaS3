/**
 * 
 */
package exo3;

/**
 * @author Sylvain-Damien
 *
 */
public class Fichier extends ComposantSysteme {

	private String nom;
	private int taille;

	/**
	 * 
	 */
	public Fichier(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo3.ComposantSysteme#getNom()
	 */
	@Override
	public String getNom() throws UnsupportedOperationException {
		return this.nom;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo3.ComposantSysteme#getTaille()
	 */
	@Override
	public int getTaille() throws UnsupportedOperationException {
		return this.taille;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo3.ComposantSysteme#addComposantSysteme(exo3.ComposantSysteme)
	 */
	@Override
	public void addComposantSysteme(ComposantSysteme composant) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Pas de composant");
	}

	@Override
	public String toString() {
		return "Fichier [nom=" + nom + ", taille=" + taille + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo3.ComposantSysteme#removeComposantSysteme(int)
	 */
	@Override
	public void removeComposantSysteme(int index) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Pas de composant");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo3.ComposantSysteme#getComposantSysteme(int)
	 */
	@Override
	public ComposantSysteme getComposantSysteme(int index) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Pas de composant");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo3.ComposantSysteme#acceptVisiteur(exo3.Visiteur)
	 */
	@Override
	public void acceptVisiteur(Visiteur visiteur) {
		visiteur.visit(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo3.Visiteur#visit(exo3.Fichier)
	 */
	@Override
	public void visit(Fichier fichier) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo3.Visiteur#visit(exo3.Repertoire)
	 */
	@Override
	public void visit(Repertoire repertoire) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo3.Visiteur#beforeVisit(exo3.ComposantSysteme)
	 */
	@Override
	public void beforeVisit(ComposantSysteme composant) {
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo3.Visiteur#afterVisit(exo3.ComposantSysteme)
	 */
	@Override
	public void afterVisit(ComposantSysteme composant) {
		throw new UnsupportedOperationException(); // TODO Auto-generated method
													// stub

	}

}
