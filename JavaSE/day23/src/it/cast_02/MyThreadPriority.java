package it.cast_02;

public class MyThreadPriority extends Thread{
	@Override
	public void run() {
		for(int x = 0 ;x<100;x++) {
			System.out.println(getName()+":"+x);
		}
	}
	
}
