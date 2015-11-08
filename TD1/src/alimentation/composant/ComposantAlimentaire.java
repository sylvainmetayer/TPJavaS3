/**
 * 
 */
package alimentation.composant;

import alimentation.util.Masse;

/**
 * @author Sylvain
 *
 */
public interface ComposantAlimentaire extends Masse {

	/**
	 * 
	 * @return
	 */
	float calculerKcal();
	
	/**
	 * 
	 * @return
	 */
	float getNbKcalParG();
	
}
