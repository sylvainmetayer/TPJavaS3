/**
 * 
 */
package exo3;

/**
 * @author Sylvain-Damien
 *
 */
public class Fichier extends ComposantSysteme{

	private String nom;
	private int taille;
	
	/**
	 * 
	 */
	public Fichier(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
	}

	/* (non-Javadoc)
	 * @see exo3.ComposantSysteme#getNom()
	 */
	@Override
	public String getNom() throws UnsupportedOperationException {
		return this.nom;
	}

	/* (non-Javadoc)
	 * @see exo3.ComposantSysteme#getTaille()
	 */
	@Override
	public int getTaille() throws UnsupportedOperationException {
		return this.taille;
	}

	/* (non-Javadoc)
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

	/* (non-Javadoc)
	 * @see exo3.ComposantSysteme#removeComposantSysteme(int)
	 */
	@Override
	public void removeComposantSysteme(int index) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Pas de composant");
	}

	/* (non-Javadoc)
	 * @see exo3.ComposantSysteme#getComposantSysteme(int)
	 */
	@Override
	public ComposantSysteme getComposantSysteme(int index) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Pas de composant");
	}

}
