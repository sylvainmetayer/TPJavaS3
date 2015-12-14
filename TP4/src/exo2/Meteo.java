/**
 * 
 */
package exo2;

/**
 * @author Sylvain-Damien
 *
 */
public class Meteo implements Observateur {

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo2.Observateur#modifier(exo2.Donnee)
	 */
	@Override
	public void modifier(Donnee d) {
		System.out.println(d.getTemperature());

	}

}
