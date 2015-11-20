/**
 * 
 */
package bourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Cette classe permet de tester le simuler le fonctionnement d'une bourse, avec
 * des Trader et des Transaction. De plus, on teste l'affichage des Filter et
 * Predicat pour filtrer les affichages.
 * 
 * @author VAREILLE-METAYER
 * @since 19 nov. 2015
 * @version 1.0
 */
public class TestBourse {

	/**
	 * Point d'entrée de l'appplication
	 * 
	 * @param args
	 *            {@link String}
	 */
	public static void main(String[] args) {
		List<Trader> traders = new ArrayList<>();

		Trader t1 = new Trader("1", "T1", "V1");
		t1.addTransaction(new Transaction(2001, 1000));
		t1.addTransaction(new Transaction(2001, 2000));
		t1.addTransaction(new Transaction(2001, 3000));
		t1.addTransaction(new Transaction(2001, 4000));

		Trader t2 = new Trader("2", "T2", "V2");
		t2.addTransaction(new Transaction(2001, 1000));
		t2.addTransaction(new Transaction(2001, 2000));
		t2.addTransaction(new Transaction(2001, 3000));
		t2.addTransaction(new Transaction(2002, 4000));

		Trader t3 = new Trader("3", "T3", "V3");
		t3.addTransaction(new Transaction(2001, 1000));
		t3.addTransaction(new Transaction(2001, 2000));
		t3.addTransaction(new Transaction(2002, 3000));
		t3.addTransaction(new Transaction(2002, 4000));

		Trader t4 = new Trader("4", "T4", "V4");
		Trader t5 = new Trader("5", "T5", "V5");
		Trader t6 = new Trader("6", "T6", "V6");

		// On ajoute tous les traders dans la liste.
		traders.addAll(Arrays.asList(t1, t2, t3, t4, t5, t6));

		// On déclare de façon anonyme l'implémentation des predicats

		System.out.println("Affichage des Trader appartenant à la ville V1 :");
		System.out.println(Filter.filter(traders, new Predicat<Trader>() {
			@Override
			public boolean test(Trader t) {
				return t.getVille().equals("V1");
			}
		}));

		System.out.println("Affichage des Trader appartenant à la ville V2 :");
		System.out.println(Filter.filter(traders, new Predicat<Trader>() {
			@Override
			public boolean test(Trader t) {
				return t.getVille().equals("V2");
			}
		}));

		System.out.println("Affichage des Trader appartenant à la ville V1 et ayant une transaction au moins :");
		System.out.println(Filter.filter(traders, new Predicat<Trader>() {
			@Override
			public boolean test(Trader t) {
				return t.getVille().equals("V1") && t.getTransactions().size() > 0;
			}
		}));

	}
}
