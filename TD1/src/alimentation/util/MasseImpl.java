/**
 * 
 */
package alimentation.util;

/**
 * Classe représentant l'implémentation de la classe {@link Masse}. <br>
 * Permet de définir une masse positive, et de connaitre sa valeur.
 * 
 * @author METAYER-VAREILLE
 * @see Masse pour l'interface correspondante
 */
public class MasseImpl implements Masse {

	private float masse;

	/**
	 * Constructeur, qui vérifie que la masse ne soit pas négative ou nulle.
	 * 
	 * @param masse
	 *            {@link Float}
	 * @throws IllegalArgumentException
	 *             lorsque la masse est inférieure à zéro
	 */
	public MasseImpl(float masse) {
		if (masse < 0) {
			throw new NullPointerException("La masse ne peut-être inférieure à 0 ! ");
		}
		this.masse = masse;
	}

	@Override
	public float getMasse() {
		return this.masse;
	}

}
