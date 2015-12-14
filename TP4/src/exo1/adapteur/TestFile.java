/**
 * 
 */
package exo1.adapteur;

/**
 * @author Sylvain
 *
 */
public class TestFile {

	public static void main(String[] args) {
		FileImpl<Integer> file = new FileImpl<>();

		file.ajouter(1);
		file.ajouter(2);
		file.supprimerTete();
		System.out.println(file.getTete());
	}
}
