/**
 * 
 */
package exo1.adapteur;

/**
 * Permet de tester l'implémentation de la classe {@link FileImpl}.
 * 
 * @author Sylvain-Damien
 *
 */
public class TestFile {

	/**
	 * Point d'entrée de l'application. Instancie une nouvelle {@link FileImpl},
	 * et ajoute, supprime des elements, avant d'afficher la tête de file.
	 * 
	 * @param args
	 *            {@link String}
	 */
	public static void main(String[] args) {
		FileImpl<Integer> file = new FileImpl<>();

		file.ajouter(1);
		file.ajouter(2);
		file.supprimerTete();
		System.out.println(file.getTete());
	}
}

/**
 * Réponses aux questions : <br>
 * Le client est : <br>
 * La Cible est : <br>
 * L'adaptateur est : <br>
 * L'adapté est : <br>
 * TODO
 */