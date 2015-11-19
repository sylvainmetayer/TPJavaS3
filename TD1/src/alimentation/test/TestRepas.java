/**
 * 
 */
package alimentation.test;

import alimentation.composant.Glucide;
import alimentation.composant.Lipide;
import alimentation.composant.Proteine;
import alimentation.produit.ProduitAlimentaire;
import alimentation.produit.Repas;
import alimentation.util.Origine;

/**
 * Classe permettant de simuler le comportement d'un repas.
 * 
 * @author METAYER-VAREILLE
 * @version 1.0
 * @since 11/11/2015
 * @see Repas pour les opérations correspondant au repas
 *
 */
public class TestRepas {

	private final ProduitAlimentaire steackHache150Grammes;
	private final ProduitAlimentaire oeuf;
	private final ProduitAlimentaire carrottesRapees100Grammes;
	private final ProduitAlimentaire tomates400Grammes;
	private final ProduitAlimentaire laitEcreme200Grammes;
	private final ProduitAlimentaire rizComplet200Grammes;

	private Repas repas;

	/**
	 * Constructeur qui instancie tout les composants d'un repas de test
	 */
	public TestRepas() {
		this.steackHache150Grammes = new ProduitAlimentaire(new Glucide(0.0F), new Lipide(8.0F), new Proteine(27.0F),
				Origine.ANIMALE);
		this.oeuf = new ProduitAlimentaire(new Glucide(0.9F), new Lipide(4.6F), new Proteine(6.3F), Origine.ANIMALE);
		this.carrottesRapees100Grammes = new ProduitAlimentaire(new Glucide(8.0F), new Lipide(0.0F), new Proteine(0.8F),
				Origine.VEGETALE);
		this.tomates400Grammes = new ProduitAlimentaire(new Glucide(1.0F), new Lipide(1.0F), new Proteine(4.0F),
				Origine.VEGETALE);
		this.laitEcreme200Grammes = new ProduitAlimentaire(new Glucide(9.6F), new Lipide(0.2F), new Proteine(6.3F),
				Origine.ANIMALE);
		this.rizComplet200Grammes = new ProduitAlimentaire(new Glucide(154.0F), new Lipide(4.4F), new Proteine(14.0F),
				Origine.VEGETALE);

		this.repas = new Repas();

		this.repas.ajouterProduitAlimentaire(steackHache150Grammes, 3);
		this.repas.ajouterProduitAlimentaire(oeuf, 6);
		this.repas.ajouterProduitAlimentaire(carrottesRapees100Grammes, 10);
		this.repas.ajouterProduitAlimentaire(tomates400Grammes, 3);
		this.repas.ajouterProduitAlimentaire(laitEcreme200Grammes, 5);
		this.repas.ajouterProduitAlimentaire(rizComplet200Grammes, 5);

	}

	/**
	 * Point d'entrée de l'application
	 * 
	 * @param args
	 *            {@link String}
	 */
	public static void main(String[] args) {
		TestRepas test = new TestRepas();

		System.out.println("Nombre de calorie totale du repas : " + test.repas.calculerKcalTotal());
		System.out.println("Nombre de calorie d'origine végéatale totale du repas : "
				+ test.repas.calculerKcalOrigineVegetaleTotal());

	}

}
