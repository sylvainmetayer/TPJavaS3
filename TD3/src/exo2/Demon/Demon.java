/**
 * 
 */
package exo2.Demon;

/**
 * @author VAREILLE-METAYER
 * @since 27 nov. 2015
 * @version 1.0
 *
 */
public class Demon extends Thread{

	/**
	 * 
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
		}finally{
			System.out.println("Pas un démon");
		}
	}
	
	@Override
	public String toString(){
		return Thread.currentThread().getName();
	}

}
