/**
 * 
 */
package alimentation.composant;

import alimentation.util.MasseImpl;

/**
 * Classe abstraite repr�sentant un Aliment. Cette classe �tend
 * {@link MasseImpl} et impl�mente {@link ComposantAlimentaire}
 * 
 * @author METAYER-VAREILLE
 * @see ComposantAlimentaire
 * 
 */
public abstract class Aliment extends MasseImpl implements ComposantAlimentaire {

	/**
	 * Constructeur. Fait appel au constructeur parent
	 * 
	 * @param masse
	 *            {@link Float}
	 * @see MasseImpl#MasseImpl(float)
	 */
	public Aliment(float masse) {
		super(masse);
	}

	@Override
	public float calculerKcal() {
		return this.getMasse() * this.getNbKcalParG();
	}
}
