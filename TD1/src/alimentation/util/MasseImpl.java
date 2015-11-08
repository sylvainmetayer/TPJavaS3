/**
 * 
 */
package alimentation.util;

/**
 * @author Sylvain
 *
 */
public class MasseImpl implements Masse {

	private float masse;
	
	/**
	 * TODO
	 * @param masse 
	 */
	public MasseImpl(float masse) {
		if (masse <0)
			throw new IllegalArgumentException("Masse doit �tre sup�rieure � 0 !");
		this.masse=masse;
	}

	/* (non-Javadoc)
	 * @see alimentation.util.Masse#getMasse()
	 */
	@Override
	public float getMasse() {
		return this.masse;
	}

}
