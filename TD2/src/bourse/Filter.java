/**
 * 
 */
package bourse;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe permettant de filtrer des elements d'une liste.
 * 
 * @author VAREILLE-METAYER
 * @since 19 nov. 2015
 * @version 1.0
 */
public class Filter {

	/**
	 * Méthode statique permettant de filtrer des elements d'une liste, selon un
	 * critère. <br>
	 * Cette méthode fonctionne de façon générique, et on utilise un Predicat
	 * (qu'il faut implémenter) pour vérifier la condition.<br>
	 * Exemple d'utilisation : <br>
	 * 
	 * Filter.filter(traders, new Predicat<Trader>() {
	 * 
	 * @Override public boolean test(Trader t) { return
	 *           t.getVille().equals("V2"); } }); <br>
	 *           Dans cet exemple, on filtre à partir d'une liste de Trader,
	 *           tous les traders dont la ville est égale à "V2"
	 * @param liste
	 *            {@link List} d'un type générique
	 * @param condition
	 *            {@link Predicat} de type générique, contenant la condition de
	 *            filtrage.
	 * @return {@link List} Une liste de type générique, filtrée selon le
	 *         prédicat donné
	 */
	public static <T> List<T> filter(List<T> liste, Predicat<T> condition) {
		List<T> retour = new ArrayList<>();

		for (T trader : liste) {
			if (condition.test(trader)) {
				retour.add(trader);
			}
		}
		return retour;
	}
}
