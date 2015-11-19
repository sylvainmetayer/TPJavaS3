package alimentation.util;

/**
 * Interface qui définit les méthodes d'une Masse. <br>
 * Voir {@link MasseImpl} pour l'implémentation
 * 
 * @author METAYER-VAREILLE
 * @see MasseImpl
 * @version 1.0
 * @since 11/11/2015
 */
public interface Masse {

	/**
	 * Retourne la masse d'un ProduitAlimentaire
	 * 
	 * @return {@link Float} qui correspond à la masse d'un ProduitAlimentaire
	 */
	float getMasse();
}
