/**
 * 
 */
package alimentation.composant;

import alimentation.util.Masse;

/**
 * Interface représentant un ComposantAlimentaire.
 * 
 * @author METAYER-VAREILLE
 * @see Masse
 */
public interface ComposantAlimentaire extends Masse {

	/**
	 * Méthode qui calcule le nombre de Kcal d'un produit.
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
