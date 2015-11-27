/**
 * 
 */
package exo2.Demon;

/**
 * @author VAREILLE-METAYER
 * @since 27 nov. 2015
 * @version 1.0
 *	Cette classe étend la classe Thread.
 */
public class Demon extends Thread{

	/**
	 * Constructeur du Demon
	 */
	public Demon() {
		setDaemon(true);
	}
	
	@Override
	public void run(){
		try{
			for(int i=0; i < 20; i++){
				System.out.println(this);
				try{
					Thread.sleep(500);
				}catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
		}finally{ //Lorsqu'on a fait 20 tours de boucle
			System.out.println("Pas un démon");
		}
	}
	
	@Override
	public String toString(){
		return Thread.currentThread().getName();
	}

}
