package it.cast_10;

public class NormalDemo {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for(int x = 0;x<100;x++) {
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			}; 
			
		}.start();
		
		
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int x = 0;x<100;x++) {
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			}
		}) {}.start();
	}
}
