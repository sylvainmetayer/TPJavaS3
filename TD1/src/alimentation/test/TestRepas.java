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
 * @author Sylvain
 *
 */
public class TestRepas {

	private ProduitAlimentaire steackHache150Grammes;
	private ProduitAlimentaire oeuf;
	private ProduitAlimentaire carrottesRapees100Grammes;
	private ProduitAlimentaire tomates400Grammes;
	private ProduitAlimentaire laitEcreme200Grammes;
	private ProduitAlimentaire rizComplet200Grammes;

	private Repas repas;

	/**
	 * 
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
	 * @param args
	 */
	public static void main(String[] args) {
		TestRepas test = new TestRepas();

		System.out.println("Nombre de calorie totale du repas : " + test.repas.calculerKcalTotal());
		System.out.println("Nombre de calorie d'origine végéatale totale du repas : "
				+ test.repas.calculerKcalOrigineVegetaleTotal());

	}

}
