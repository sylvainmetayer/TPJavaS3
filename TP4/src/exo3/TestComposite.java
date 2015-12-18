/**
 * 
 */
package exo3;

/**
 * @author Sylvain-Damien
 *
 */
public class TestComposite {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Repertoire C = new Repertoire("C:");
		Repertoire Win = new Repertoire("Windows");
		Repertoire Sys = new Repertoire("System32");
		Repertoire temp = new Repertoire("temp");
		Repertoire wini = new Repertoire("win.ini");
		
		Fichier adsnt = new Fichier("adsnt.dll", 12030);
		Fichier advnt = new Fichier("advnt.dll", 43220);
		Fichier test = new Fichier("test.data", 500);
		
		C.addComposantSysteme(Win);
		Win.addComposantSysteme(Sys);
		Sys.addComposantSysteme(adsnt);
		Sys.addComposantSysteme(advnt);
		Sys.addComposantSysteme(wini);
		C.addComposantSysteme(temp);
		temp.addComposantSysteme(test);
		
		System.out.println(C);
		
		//On affiche le sysout du répertoire C.

	}

}
