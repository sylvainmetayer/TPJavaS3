/**
 * 
 */
package alimentation.composant;

import alimentation.util.Masse;

/**
 * Interface repr�sentant un ComposantAlimentaire.
 * 
 * @author METAYER-VAREILLE
 * @see Masse
 * @version 1.0
 * @since 11/11/2015
 */
public interface ComposantAlimentaire extends Masse {

	/**
	 * M�thode qui calcule le nombre de Kcal d'un produit.
	 * 
	 * @return {@link Float}
	 */
	float calculerKcal();

	/**
	 * Retourne le nombre de Kcal par gramme d'un ComposantAlimentaire
	 * 
	 * @return {@link Float}
	 */
	float getNbKcalParG();

}
