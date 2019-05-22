package it.cast_01;

public class MyThread extends Thread {
	
	public MyThread() {
	}

	public MyThread(String name) {
		super(name);
	}

	public void run() {
		for (int x = 0;x<10;x++) {
			System.out.println(getName()+":"+x);
		}
	}	
}
