package it.cast_02;

public class MyThreadPriorityDemo {
	public static void main(String[] args) {
		MyThreadPriority tp1 = new MyThreadPriority();
		MyThreadPriority tp2 = new MyThreadPriority();
		MyThreadPriority tp3 = new MyThreadPriority();
		
		tp1.setName("a");
		tp2.setName("b");
		tp3.setName("c");
	
		tp1.setPriority(1);
		
		tp3.setPriority(10);
	
		tp1.start();
		tp2.start();
		tp3.start();
	}
}
