/**
 * 
 */
package exo1.adapteur;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sylvain-Damien <br>
 *         Implémentation de {@link File} La javadoc a été précisé lorsque
 *         nécessaire, se reférer à {@link File} pour plus de détails sur les
 *         méthodes.
 * @param <T>
 *            type générique de la file.
 * @see File pour la documentation de la file.
 */
public class FileImpl<T> implements File<T> {

	private List<T> file;

	/**
	 * Constructeur, qui instancie une nouvelle liste.
	 */
	public FileImpl() {
		this.file = new ArrayList<>();
	}

	/**
	 * Permet d'ajouter un element à la fin de la liste.<br>
	 * Levée d'une exception si l'element passé est null.
	 * 
	 * @throws NullPointerException
	 *             si l'element est nul.
	 * @see File#ajouter(Object)
	 */
	@Override
	public void ajouter(T t) {
		if (t == null) {
			throw new NullPointerException();
		}

		this.file.add(t);

	}

	/**
	 * Permet de consulter l'element en tête de liste..<br>
	 * Levée d'une exception si la liste est vide.
	 * 
	 * 
	 * @throws IllegalStateException
	 *             si la file est vide.
	 * @see File#getTete()
	 */
	@Override
	public T getTete() {
		if (file.isEmpty())
			throw new IllegalStateException("La file est vide !");
		return this.file.get(0);
	}

	/**
	 * Permet supprimer un element à la liste.<br>
	 * Levée d'une exception si la file est vide.
	 * 
	 * @throws IllegalStateException
	 *             si la file est vide.
	 * @see File#supprimerTete()
	 */
	@Override
	public void supprimerTete() {
		if (estVide())
			throw new IllegalStateException("La file est vide!");
		this.file.remove(0);
	}

	@Override
	public int longueur() {
		return this.file.size();
	}

	@Override
	public boolean estVide() {
		return this.file.isEmpty();
	}
}