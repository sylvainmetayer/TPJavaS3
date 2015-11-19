/**
 * 
 */
package bourse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author VAREILLE-METAYER
 * @since 19 nov. 2015
 * @version 1.0
 */
public class Filter {

	public static <T> List<T> filter(List<T> t, Predicat<T> p) {
		List<T> l = new ArrayList<>();

		for (T trader : t) {
			if (p.test(trader)) {
				l.add(trader);
			}
		}
		return l;
	}
}
