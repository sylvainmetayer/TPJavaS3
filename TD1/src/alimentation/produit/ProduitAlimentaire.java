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
 * Classe représentant un ProduitAlimentaire. <br>
 * Un ProduitAlimentaire est composé de Lipide, Proteine, Glucide et possède une
 * Origine.<br>
 * Il est possible de calculer les Kcal du produit, et de connaitre l'origine de
 * ce dernier
 * 
 * @author METAYER-VAREILLE
 * @version 1.0
 * @since 11/11/2015
 */
public class ProduitAlimentaire {

	private Lipide lipide;
	private Proteine proteine;
	private Glucide glucide;
	private Origine origine;

	/**
	 * Constructeur, constitué de Lipide, Glucide, Proteine et d'une Origine.
	 * <br>
	 * Des controles sont effectues pour vérifier l'intégrité de l'objet
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
	 *             si l'un des paramètres est <code>null</code>
	 */
	public ProduitAlimentaire(Glucide glucide, Lipide lipide, Proteine proteine, Origine origine) {
		Objects.requireNonNull(glucide, "Le masse doit être supérieure à 0 !");
		// Test de requireNonNull (JavaSE8)

		if (proteine == null || lipide == null | origine == null) {
			throw new NullPointerException("Les valeurs ne peuvent être nulles.");
		}

		this.proteine = proteine;
		this.glucide = glucide;
		this.lipide = lipide;
		this.origine = origine;
	}

	/**
	 * Permet de retourner l'origine du produit
	 * 
	 * @return {@link Origine} qui correspond à l'origine du produit
	 */
	public Origine getOrigine() {
		return this.origine;
	}

	/**
	 * Permet de calculer le nombre de Kcal d'un produit.<br>
	 * Cette valeur correspond à la somme des Kcal des proteines, lipides et
	 * glucides.
	 * 
	 * @return {@link Float} correspondant au nombre de Kcal du produit
	 */
	public float calculerKcalProduit() {
		return this.proteine.calculerKcal() + this.lipide.calculerKcal() + this.glucide.calculerKcal();
	}

	/**
	 * Redéfinition de toString
	 */
	@Override
	public String toString() {
		return "ProduitAlimentaire [ Origine :" + this.origine + " " + this.proteine + " " + this.lipide + " "
				+ this.glucide;
	}
}
