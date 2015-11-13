/**
 * 
 */
package alimentation.util;

/**
 * Classe repr�sentant l'impl�mentation de la classe {@link Masse}. <br>
 * Permet de d�finir une masse positive, et de connaitre sa valeur.
 * 
 * @author METAYER-VAREILLE
 * @see Masse pour l'interface correspondante
 */
public class MasseImpl implements Masse {

	private float masse;

	/**
	 * Constructeur, qui v�rifie que la masse ne soit pas n�gative ou nulle.
	 * 
	 * @param masse
	 *            {@link Float}
	 * @throws IllegalArgumentException
	 *             lorsque la masse est inf�rieure � z�ro
	 */
	public MasseImpl(float masse) {
		if (masse < 0) {
			throw new NullPointerException("La masse ne peut-�tre inf�rieure � 0 ! ");
		}
		this.masse = masse;
	}

	@Override
	public float getMasse() {
		return this.masse;
	}

}
