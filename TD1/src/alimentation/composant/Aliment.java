/**
 * 
 */
package alimentation.composant;

import alimentation.util.MasseImpl;

/**
 * @author Sylvain
 *
 */
public abstract class Aliment extends MasseImpl implements ComposantAlimentaire {

	/**
	 * @param masse 
	 * 
	 */
	public Aliment(float masse) {
		super(masse);
	}
	
	@Override
	public float calculerKcal() {
		return this.getMasse()*this.getNbKcalParG();
	}	
}
