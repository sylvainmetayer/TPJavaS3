/**
 * 
 */
package exercice1.realisation;

/**
 *	Cette classe étend la classe Thread.
 * @author VAREILLE-METAYER
 * @since 20 nov. 2015
 * @version 1.0
 */
public class WhoIsThread extends Thread{

	/**
	 * Constructeur de la classe WhoIsThread
	 */
	public WhoIsThread() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see java.lang.Thread
	 */
	@Override
	public void run(){
		for(int i=0; i < 20; i++){
			System.out.println(this);
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
	/**
	 * @see java.lang.Object
	 */
	@Override
	public String toString(){
		return Thread.currentThread().getName();
	}

}
