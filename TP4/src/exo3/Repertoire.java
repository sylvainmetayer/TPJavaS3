package exo3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sylvain-Damien
 *
 */
public class Repertoire extends ComposantSysteme {
	
	private String nom;
	private List<ComposantSysteme> listComposantSysteme;
	
	public Repertoire(String nom) {
		this.nom = nom;
		this.listComposantSysteme = new ArrayList<>();
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
		int taille = 0;
		for(ComposantSysteme composant : listComposantSysteme){
			taille += composant.getTaille();
		}
		return taille;		
	}

	/* (non-Javadoc)
	 * @see exo3.ComposantSysteme#addComposantSysteme(exo3.ComposantSysteme)
	 */
	@Override
	public void addComposantSysteme(ComposantSysteme composant) throws UnsupportedOperationException {
		this.listComposantSysteme.add(composant);
		
	}

	/* (non-Javadoc)
	 * @see exo3.ComposantSysteme#removeComposantSysteme(int)
	 */
	@Override
	public void removeComposantSysteme(int index) throws UnsupportedOperationException {
		if(listComposantSysteme.get(index) == null){
			throw new UnsupportedOperationException("Ce composant n'existe pas");
		}
		listComposantSysteme.remove(index);
	}

	/* (non-Javadoc)
	 * @see exo3.ComposantSysteme#getComposantSysteme(int)
	 */
	@Override
	public ComposantSysteme getComposantSysteme(int index) throws UnsupportedOperationException {
		if(listComposantSysteme.get(index) == null){
			throw new UnsupportedOperationException("Ce composant n'existe pas");
		}
		return listComposantSysteme.get(index);
	}


	@Override
	public String toString() {
		return "Repertoire [nom=" + nom + ", listComposantSysteme="
				+ listComposantSysteme + "]";
	}
}


