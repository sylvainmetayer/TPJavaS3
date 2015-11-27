/**
 * 
 */
package exo8;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

/**
 * @author VAREILLE-METAYER
 * @since 25 nov. 2015
 * @version 1.0
 *
 */
public class TestLongAction extends JFrame {
	private static final long serialVersionUID = 1L;
	final JButton btnAction;

	public TestLongAction() {
		btnAction = new JButton("Start");
		btnAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// new LongAction().traitementLong(); // freeze la fenetre
				// new LongActionMethodeUne().start(); // solution 1
				new MonSwingWorker().execute(); // solution 2
			}
		});
		final Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(2, 1));
		contentPane.add(btnAction);

		setTitle("Test de LongAction");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TestLongAction();
	}
}

// Etant donné qu'on travaille sur le même Thread, le rafraichissement de la
// fenêtre est bloqué durant le traitement de l'action longue.

// Les deux facons : Une en creeant une classe qui extends Thread, et qui traite
// l'action longue dans un thread séparé. La deuxième solution est d'utiliser le
// SwingWorker afin de réaliser le traitement