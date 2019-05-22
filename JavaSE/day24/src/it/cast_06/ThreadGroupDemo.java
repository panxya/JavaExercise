package it.cast_06;

public class ThreadGroupDemo {
	
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("dfg");
		
		MyRunnable mr = new MyRunnable();
		
		Thread t1 = new Thread(tg,mr,"ажаж");
		Thread t2 = new Thread(tg,mr,"lily");
		t1.start();	
	}
}	
		

