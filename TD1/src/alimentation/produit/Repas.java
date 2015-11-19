/**
 * 
 */
package alimentation.produit;

import java.util.ArrayList;
import java.util.List;

import alimentation.util.Origine;

/**
 * Classe repr�sentant un repas, compos� d'une liste de ProduitAlimentaire. <br>
 * Il est possible d'ajouter des produits au repas, et de calculer le nombre de
 * Kcal total du repas.
 * 
 * @author METAYER-VAREILLE
 * @version 1.0
 * @since 11/11/2015
 */
public class Repas {

	/**
	 * Liste contenant les diff�rents produits
	 */
	private List<ProduitAlimentaire> produits;

	/**
	 * Constructeur qui initialise une liste de ProduitAlimentaire
	 */
	public Repas() {
		this.produits = new ArrayList<>();
	}

	/**
	 * M�thode qui permet d'ajouter n ProduitAlimentaire � la liste de produits
	 * du repas. <br>
	 * Il n'est pas possible d'ajouter un nombre de produit n�gatif, ou
	 * d'ajouter un produit <code>null</code>
	 * 
	 * @param produit
	 *            {@link ProduitAlimentaire} : Le produit � ajouter au repas
	 * @param nombre
	 *            {@link Integer} : le nombre de fois que l'on souhaite ajouter
	 *            ce produit
	 * @throws IllegalArgumentException
	 *             lorsque le nombre de produit � ajouter est <code>null</code>
	 * @throws NullPointerException
	 *             lorsque le produit que l'on veut ajouter est
	 *             <code>null</code>
	 */
	public void ajouterProduitAlimentaire(ProduitAlimentaire produit, int nombre) {
		if (nombre < 0) {
			throw new IllegalArgumentException("Nombre doit etre sup�rieur � 0 !");
		}
		if (produit == null) {
			throw new NullPointerException("Produit est null !");
		}

		for (int i = 0; i < nombre; i++) {
			produits.add(produit);
		}
	}

	/**
	 * M�thode qui permet de calculer le nombre de Kcal d'un repas. <br>
	 * Cette valeur correspond � la somme des Kcal de chacun des
	 * ComposantAlimentaire pr�sent dans le ProduitAlimentaire
	 * 
	 * @return {@link Float} qui correspond au nombre de Kcal
	 */
	public float calculerKcalTotal() {
		float total = 0.0F;

		for (ProduitAlimentaire produit : produits) {
			total += produit.calculerKcalProduit();
		}
		return total;
	}

	/**
	 * M�thode qui permet de calculer le nombre de Kcal d'un repas, en ne
	 * prenant en compte que les ProduitAlimentaire etant d'origine
	 * {@link Origine#VEGETALE} . <br>
	 * 
	 * Cette valeur correspond � la somme des Kcal de chacun des
	 * ComposantAlimentaire pr�sent dans le ProduitAlimentaire
	 * 
	 * @return {@link Float} qui correspond au nombre de Kcal
	 */
	public float calculerKcalOrigineVegetaleTotal() {
		float total = 0.0F;

		for (ProduitAlimentaire produit : produits) {
			if (produit.getOrigine().equals(Origine.VEGETALE)) {
				total += produit.calculerKcalProduit();
			}
		}
		return total;
	}

}
