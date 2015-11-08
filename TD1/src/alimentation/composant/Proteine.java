/**
 * 
 */
package alimentation.composant;

/**
 * @author Sylvain
 *
 */
public class Proteine extends Aliment{

	private final static float NB_KCAL_PAR_G = 4.0F;
	
	/**
	 * @param masse
	 */
	public Proteine(float masse) {
		super(masse);
	}

	/* (non-Javadoc)
	 * @see alimentation.composant.ComposantAlimentaire#getNbKcalParG()
	 */
	@Override
	public float getNbKcalParG() {
		return Proteine.NB_KCAL_PAR_G;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Proteine [Masse :"+this.getMasse()+"]";
	}
	
}
