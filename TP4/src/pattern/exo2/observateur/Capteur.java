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
public class Capteur implements Runnable, Sujet {

	private List<Observateur> observateurs;
	private Donnee donnee;

	public Capteur() {
		this.observateurs = new ArrayList<>();
	}

	@Override
	public void ajouterObservateur(Observateur o) {
		if (o == null)
			throw new NullPointerException();
		this.observateurs.add(o);
	}

	@Override
	public void retirerObservateur(Observateur o) {
		if (!observateurs.contains(o))
			throw new IllegalStateException();
		this.observateurs.remove(o);

	}

	@Override
	public void notifierObervateur() {
		for (Observateur o : observateurs) {
			o.modifier(donnee);
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				this.donnee = new Donnee(0, 0, 0);
				// TODO données à faire en aléatoire
				notifierObervateur();
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
