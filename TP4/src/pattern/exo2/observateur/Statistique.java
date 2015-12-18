package pattern.exo2.observateur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe permettant d'établir des statistique sur un {@link Sujet}. Contient
 * une liste de temperature, qui permet d'établir des statistiques.
 * 
 * @author Sylvain-Damien
 * @see Observateur
 */
public class Statistique implements Observateur {

	private List<Double> temperatures;

	/**
	 * Constructeur, qui instancie une nouvelle liste de température.
	 */
	public Statistique() {
		this.temperatures = new ArrayList<>();
	}

	/**
	 * Retourne la température minimale.
	 * 
	 * @return {@link Double}
	 */
	public double getMinTemperature() {
		if (temperatures.isEmpty()) {
			throw new NullPointerException();
		}
		return Collections.min(temperatures);
	}

	/**
	 * Retourne la température maximale.
	 * 
	 * @return {@link Double}
	 */
	public double getMaxTemperature() {
		if (temperatures.isEmpty()) {
			throw new NullPointerException();
		}
		return Collections.max(temperatures);
	}

	/**
	 * Retourne la moyenne des températures.
	 * 
	 * @return {@link Double}
	 */
	public double getCumulTemperature() {
		double somme = 0;
		for (Double d : temperatures) {
			somme += d;
		}
		return somme / temperatures.size();
	}

	/**
	 * Affiche la température maximale, minimale, et moyenne de toutes les
	 * données reçues. Ajoute également la temperature de la données reçues dans
	 * la listes des temperatures.
	 * 
	 * @see Observateur#modifier(Donnee) pour plus de détails
	 * @throws NullPointerException
	 *             si la donnée est <code>null</code>
	 */
	@Override
	public void modifier(Donnee d) {
		if (d == null) {
			throw new NullPointerException("La donnée est nulle.");
		}
		this.temperatures.add(d.getTemperature());

		StringBuilder sb = new StringBuilder();
		sb.append("\n\nTemperature donnée : " + d.getTemperature());
		sb.append("\nTemperature minimale : " + getMinTemperature());
		sb.append("\nTemperature maximale : " + getMaxTemperature());
		sb.append("\nMoyenne temperature : " + getCumulTemperature());
		sb.append("\n----------------------\n");
		System.out.println(sb.toString());
	}

}
