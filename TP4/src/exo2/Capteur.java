/**
 * 
 */
package exo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sylvain-Damien
 *
 */
public class Capteur implements Runnable, Sujet {

	private List<Observateur> observateurs;
	private Donnee donnee;

	/**
	 * 
	 */
	public Capteur() {
		this.observateurs = new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo2.Sujet#ajouterObservateur(exo2.Observateur)
	 */
	@Override
	public void ajouterObservateur(Observateur o) {
		if (o == null)
			throw new NullPointerException();
		this.observateurs.add(o);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo2.Sujet#retirerObservateur(exo2.Observateur)
	 */
	@Override
	public void retirerObservateur(Observateur o) {
		if (!observateurs.contains(o))
			throw new IllegalStateException();
		this.observateurs.remove(o);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see exo2.Sujet#notifierObervateur()
	 */
	@Override
	public void notifierObervateur() {
		for (Observateur o : observateurs) {
			o.modifier(donnee);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
			while (true) {
				this.donnee = new Donnee();
				notifierObervateur();
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
