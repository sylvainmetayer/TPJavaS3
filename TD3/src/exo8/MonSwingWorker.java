/**
 * 
 */
package exo8;

import javax.swing.SwingWorker;

/**
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class MonSwingWorker extends SwingWorker<Object, Object> {

	public MonSwingWorker() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.SwingWorker#doInBackground()
	 */
	@Override
	protected Object doInBackground() throws Exception {
		new LongAction().traitementLong();
		return null; // obligatoire
	}
}
