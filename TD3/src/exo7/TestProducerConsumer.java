/**
 * 
 */
package exo7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class TestProducerConsumer {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		Thread producteur = new Producteur(10, strings);
		Thread consumer = new Consommateur(strings);

		producteur.start();
		consumer.start();
	}
}
