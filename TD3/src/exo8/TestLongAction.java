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
		// Ajout du listener bouton
		btnAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// new LongAction().traitementLong(); //freeze la fenetre
				new LongActionMethodeUne().start(); // solution 1
				// solution 2
			}
		});
		final Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(2, 1));
		contentPane.add(btnAction);
		setSize(400, 800);
		setTitle("Test de LongAction");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new TestLongAction();

	}
}

// Etant donné qu'on travaille sur le même Thread, le rafraichissement de la
// fenêtre est bloqué durant le traitement de l'action longue.

// LEs deux facons : Une en implémentant runnable, l'autre extends Thread ?