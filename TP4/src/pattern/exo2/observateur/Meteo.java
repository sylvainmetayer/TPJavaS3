/**
 * 
 */
package pattern.exo2.observateur;

/**
 * Classe représentant une station météo.
 * 
 * @author Sylvain-Damien
 *
 */
public class Meteo implements Observateur {

	/**
	 * Affiche la température de la donnée.
	 * 
	 * @see Observateur#modifier(Donnee) pour plus de détails
	 */
	@Override
	public void modifier(Donnee d) {
		if (d == null)
			throw new NullPointerException("La donnée est nulle");
		System.out.println("Temperature : " + d.getTemperature());
	}

}
