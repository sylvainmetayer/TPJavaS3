/**
 * 
 */
package alimentation.composant;

/**
 * Classe repr�sentant le comportement d'une Glucide. <br>
 * Il est �galement possible de savoir le nombre de Kcal � l'aide de la m�thode
 * {@link Aliment#calculerKcal()}
 * 
 * @author METAYER-VAREILLE
 * @see Aliment pour les m�thodes associ�es
 */
public class Glucide extends Aliment {

	/**
	 * Correspond au nombre de Kcal par gramme
	 */
	private final static float NB_KCAL_PAR_G = 9.0F;

	/**
	 * Constructeur faisant r�f�rence au constructeur parent
	 * 
	 * @param masse
	 *            {@link Float} repr�sentant la masse de la glucide
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
	 * Red�finition de toString
	 */
	@Override
	public String toString() {
		return "Glucide [Masse :" + this.getMasse() + "]";
	}

}
