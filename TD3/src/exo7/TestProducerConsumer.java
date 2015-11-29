/**
 * 
 */
package exo7;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette application permet d'instancier un producteur et deux consommateur, et
 * de les faires consommer/produire des chaines de caractères
 * 
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class TestProducerConsumer {

	/**
	 * Point d'entrée de l'application, qui instancie 3 thread, deux
	 * consommateur et un producteur
	 * 
	 * @param args
	 *            {@link String}
	 */
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		final Thread producteur = new Producteur(10, strings);
		final Thread consumer = new Consommateur(strings);
		final Thread consommateur = new Consommateur(strings);

		producteur.start();
		consumer.start();
		consommateur.start();
	}
}

// Le consommateur a un sleep(1000) tandis que le producteur a seulement un
// sleep(500), ce qui fait qu'il produit deux fois plus vite, et que lorsque la
// file est pleine, le producteur se met en attente, et on a un petit temps
// d'attente. De plus, le consommateur sera plus en attente

// Pour équilibrer le traitement, il suffit de créer un deuxième consommateur,
// et ainsi, on aura deux consommations par seconde pour deux productions par
// seconde