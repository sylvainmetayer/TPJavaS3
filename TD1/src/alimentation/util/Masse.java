package alimentation.util;

/**
 * Interface qui d�finit les m�thodes d'une Masse. <br>
 * Voir {@link MasseImpl} pour l'impl�mentation
 * 
 * @author METAYER-VAREILLE
 * @see MasseImpl
 */
public interface Masse {

	/**
	 * Retourne la masse d'un ProduitAlimentaire
	 * 
	 * @return {@link Float} qui correspond � la masse d'un ProduitAlimentaire
	 */
	float getMasse();
}
