/**
 * 
 */
package alimentation.composant;

/**
 * @author Sylvain
 *
 */
public class Glucide extends Aliment{

	private final static float NB_KCAL_PAR_G = 9.0F;
	
	/**
	 * @param masse
	 */
	public Glucide(float masse) {
		super(masse);
	}

	/* (non-Javadoc)
	 * @see alimentation.composant.ComposantAlimentaire#getNbKcalParG()
	 */
	@Override
	public float getNbKcalParG() {
		return Glucide.NB_KCAL_PAR_G;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Glucide [Masse :"+this.getMasse()+"]";
	}
	
}
