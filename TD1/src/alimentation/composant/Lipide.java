/**
 * 
 */
package alimentation.composant;

/**
 * Classe repr�sentant le comportement d'une Lipide. <br>
 * Il est �galement possible de savoir le nombre de Kcal � l'aide de la m�thode
 * {@link Aliment#calculerKcal()}
 * 
 * @author METAYER-VAREILLE
 * @see Aliment pour les m�thodes associ�es
 * @version 1.0
 * @since 11/11/2015
 */
public class Lipide extends Aliment {

	/**
	 * Correspond au nombre de Kcal par gramme
	 */
	private final static float NB_KCAL_PAR_G = 4.0F;

	/**
	 * Constructeur faisant r�f�rence au constructeur parent
	 * 
	 * @param masse
	 *            {@link Float} repr�sentant la masse de la lipide
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
	 * Red�finition de toString
	 */
	@Override
	public String toString() {
		return "Lipide [Masse :" + this.getMasse() + "]";
	}

}
