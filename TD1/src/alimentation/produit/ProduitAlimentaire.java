/**
 * 
 */
package alimentation.produit;

import java.util.Objects;

import com.sun.management.VMOption.Origin;

import alimentation.composant.Glucide;
import alimentation.composant.Lipide;
import alimentation.composant.Proteine;
import alimentation.util.Origine;

/**
 * Classe repr�sentant un ProduitAlimentaire. <br>
 * Un ProduitAlimentaire est compos� de Lipide, Proteine, Glucide et poss�de une
 * Origine.<br>
 * Il est possible de calculer les Kcal du produit, et de connaitre l'origine de
 * ce dernier
 * 
 * @author METAYER-VAREILLE
 * 
 */
public class ProduitAlimentaire {

	private Lipide lipide;
	private Proteine proteine;
	private Glucide glucide;
	private Origine origine;

	/**
	 * Constructeur, constitu� de Lipide, Glucide, Proteine et d'une Origine.
	 * <br>
	 * Des controles sont effectues pour v�rifier l'int�grit� de l'objet
	 * 
	 * @param glucide
	 *            {@link Glucide}
	 * @param lipide
	 *            {@link Lipide}
	 * @param proteine
	 *            {@link Proteine}
	 * @param origine
	 *            {@link Origin}
	 * @throws NullPointerException
	 *             si l'un des param�tres est <code>null</code>
	 */
	public ProduitAlimentaire(Glucide glucide, Lipide lipide, Proteine proteine, Origine origine) {
		Objects.requireNonNull(glucide, "Le masse doit �tre sup�rieure � 0 !");
		// Test de requireNonNull (JavaSE8)

		if (proteine == null || lipide == null | origine == null) {
			throw new NullPointerException("Les valeurs ne peuvent �tre nulles.");
		}

		this.proteine = proteine;
		this.glucide = glucide;
		this.lipide = lipide;
		this.origine = origine;
	}

	/**
	 * Permet de retourner l'origine du produit
	 * 
	 * @return {@link Origine} qui correspond � l'origine du produit
	 */
	public Origine getOrigine() {
		return this.origine;
	}

	/**
	 * Permet de calculer le nombre de Kcal d'un produit.<br>
	 * Cette valeur correspond � la somme des Kcal des proteines, lipides et
	 * glucides.
	 * 
	 * @return {@link Float} correspondant au nombre de Kcal du produit
	 */
	public float calculerKcalProduit() {
		return this.proteine.calculerKcal() + this.lipide.calculerKcal() + this.glucide.calculerKcal();
	}

	/**
	 * Red�finition de toString
	 */
	@Override
	public String toString() {
		return "ProduitAlimentaire [ Origine :" + this.origine + " " + this.proteine + " " + this.lipide + " "
				+ this.glucide;
	}
}
