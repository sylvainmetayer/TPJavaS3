/**
 * 
 */
package alimentation.composant;

/**
 * Classe représentant le comportement d'une Glucide. <br>
 * Il est également possible de savoir le nombre de Kcal à l'aide de la méthode
 * {@link Aliment#calculerKcal()}
 * 
 * @author METAYER-VAREILLE
 * @see Aliment pour les méthodes associées
 * @version 1.0
 * @since 11/11/2015
 */
public class Glucide extends Aliment {

	/**
	 * Correspond au nombre de Kcal par gramme
	 */
	private final static float NB_KCAL_PAR_G = 9.0F;

	/**
	 * Constructeur faisant référence au constructeur parent
	 * 
	 * @param masse
	 *            {@link Float} représentant la masse de la glucide
	 * @see Aliment pour le constructeur parent
	 */
	public Glucide(float masse) {
		super(masse);
	}

	@Override
	public float getNbKcalParG() {
		return Glucide.NB_KCAL_PAR_G;
	}

	/**
	 * Redéfinition de toString
	 */
	@Override
	public String toString() {
		return "Glucide [Masse :" + this.getMasse() + "]";
	}

}
