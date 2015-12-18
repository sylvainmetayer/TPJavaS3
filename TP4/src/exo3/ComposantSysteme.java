package exo3;

/**
 * @author Sylvain-Damien
 *
 */
public abstract class ComposantSysteme {
	
	public abstract String getNom() throws UnsupportedOperationException;
	
	public abstract int getTaille() throws UnsupportedOperationException;
	
	public abstract void addComposantSysteme(ComposantSysteme composant) throws UnsupportedOperationException;
	
	public abstract void removeComposantSysteme(int index) throws UnsupportedOperationException;
	
	public abstract ComposantSysteme getComposantSysteme(int index) throws UnsupportedOperationException;
}
