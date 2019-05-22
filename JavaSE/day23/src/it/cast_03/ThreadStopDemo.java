package it.cast_03;

public class ThreadStopDemo {
	
	public static void main(String[] args) {
		
		ThreadStop ts = new ThreadStop();
		ts.start();
		
		try {
			Thread.sleep(3000);
			ts.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
