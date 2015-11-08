/**
 * 
 */
package alimentation.produit;

import alimentation.composant.Glucide;
import alimentation.composant.Lipide;
import alimentation.composant.Proteine;
import alimentation.util.Origine;

/**
 * @author Sylvain
 *
 */
public class ProduitAlimentaire {

	private Lipide lipide;
	private Proteine proteine;
	private Glucide glucide;
	private Origine origine;

	/**
	 * @param glucide
	 * @param lipide
	 * @param proteine
	 * @param origine
	 * 
	 */
	public ProduitAlimentaire(Glucide glucide, Lipide lipide, Proteine proteine, Origine origine) {
		this.proteine = proteine;
		this.glucide = glucide;
		this.lipide = lipide;
		this.origine = origine;
	}

	public Origine getOrigine() {
		return this.origine;
	}

	public float calculerKcalProduit() {
		return this.proteine.calculerKcal() + this.lipide.calculerKcal() + this.glucide.calculerKcal();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProduitAlimentaire [ Origine :" + this.origine + " " + this.proteine + " " + this.lipide + " "
				+ this.glucide;
	}
}
