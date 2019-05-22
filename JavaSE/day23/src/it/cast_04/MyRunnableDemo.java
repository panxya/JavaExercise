package it.cast_04;

public class MyRunnableDemo {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr,"明明");
		Thread t2 = new Thread(mr,"高高");
		
		t1.start();
		t2.start();
	}
}
