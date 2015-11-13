/**
 * 
 */
package alimentation.composant;

/**
 * Classe représentant le comportement d'une Lipide. <br>
 * Il est également possible de savoir le nombre de Kcal à l'aide de la méthode
 * {@link Aliment#calculerKcal()}
 * 
 * @author METAYER-VAREILLE
 * @see Aliment pour les méthodes associées
 */
public class Lipide extends Aliment {

	/**
	 * Correspond au nombre de Kcal par gramme
	 */
	private final static float NB_KCAL_PAR_G = 4.0F;

	/**
	 * Constructeur faisant référence au constructeur parent
	 * 
	 * @param masse
	 *            {@link Float} représentant la masse de la lipide
	 * @see Aliment pour le constructeur parent
	 */
	public Lipide(float masse) {
		super(masse);
	}

	@Override
	public float getNbKcalParG() {
		return Lipide.NB_KCAL_PAR_G;
	}

	/**
	 * Redéfinition de toString
	 */
	@Override
	public String toString() {
		return "Lipide [Masse :" + this.getMasse() + "]";
	}

}
