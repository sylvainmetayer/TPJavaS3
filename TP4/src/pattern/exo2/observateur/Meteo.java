/**
 * 
 */
package pattern.exo2.observateur;

/**
 * @author Sylvain-Damien
 *
 */
public class Meteo implements Observateur {

	@Override
	public void modifier(Donnee d) {
		System.out.println(d.getTemperature());
	}

}
