/**
 * 
 */
package exercice1.realisation;

/**
 * @author VAREILLE-METAYER
 * @since 20 nov. 2015
 * @version 1.0
 *
 */
public class WhoIsThread extends Thread{

	/**
	 * 
	 */
	public WhoIsThread() {
		// TODO Auto-generated constructor stub
	}
	
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
	
	@Override
	public String toString(){
		return Thread.currentThread().getName();
	}

}
