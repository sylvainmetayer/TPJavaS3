/**
 * 
 */
package exo8;

import javax.swing.SwingWorker;

/**
 * Classe qui etends la classe {@link SwingWorker} afin de ne pas gêner
 * l'affichage graphique
 * 
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class MonSwingWorker extends SwingWorker<Object, Object> {

	/**
	 * Constructeur
	 */
	public MonSwingWorker() {
	}

	/*
	 * Permet de déléguer la tâche dans un Thread annexe afin de ne pas déranger
	 * le Thread d'affichage. La délégation se fait par le swing Worker .
	 * 
	 * @see javax.swing.SwingWorker#doInBackground()
	 */
	@Override
	protected Object doInBackground() throws Exception {
		new LongAction().traitementLong();
		return null;
	}
}
