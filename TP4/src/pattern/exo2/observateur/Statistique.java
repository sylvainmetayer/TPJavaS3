/**
 * 
 */
package pattern.exo2.observateur;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sylvain-Damien
 *
 */
public class Statistique implements Observateur {

	private List<Donnee> donnees;

	/**
	 * 
	 */
	public Statistique() {
		this.donnees = new ArrayList<>();
	}

	public double getMinTemperature() {
		double min = 0;
		for (Donnee d : donnees) {
			if (d.getTemperature() < min) {
				min = d.getTemperature();
			}
		}
		return min;
	}

	public double getMaxTemperature() {
		double max = 0;
		for (Donnee d : donnees) {
			if (d.getTemperature() > max) {
				max = d.getTemperature();
			}
		}
		return max;
	}

	public double getCumulTemperature() {
		double somme = 0;
		for (Donnee d : donnees) {
			somme += d.getTemperature();
		}
		return somme;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo2.Observateur#modifier(exo2.Donnee)
	 */
	@Override
	public void modifier(Donnee d) {
		if (d == null) {
			throw new NullPointerException();
		}
		this.donnees.add(d);
	}

}
