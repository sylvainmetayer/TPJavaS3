/**
 * 
 */
package exo1.adapteur;

import java.util.ArrayList;
import java.util.List;

public class FileImpl<T> implements File<T> {

	private List<T> file;

	/**
	 * 
	 */
	public FileImpl() {
		this.file = new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo1.adapteur.File#ajouter(java.lang.Object)
	 */
	@Override
	public void ajouter(T t) {
		if (t == null) {
			throw new NullPointerException();
		}

		this.file.add(t);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo1.adapteur.File#getTete()
	 */
	@Override
	public T getTete() {
		return this.file.get(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo1.adapteur.File#supprimerQueue()
	 */
	@Override
	public void supprimerTete() {
		if (!estVide()) {
			this.file.remove(0);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo1.adapteur.File#longueur()
	 */
	@Override
	public int longueur() {
		return this.file.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo1.adapteur.File#estVide()
	 */
	@Override
	public boolean estVide() {
		return this.file.isEmpty();
	}
}