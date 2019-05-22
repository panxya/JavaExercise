package it.cast_03;

public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ts1.setName("a");
		
		ts2.setName("b");
		
		
		
		ts1.start();
		ts2.start();
	}
}
