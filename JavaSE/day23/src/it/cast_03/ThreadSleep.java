package it.cast_03;

import java.util.Date;

public class ThreadSleep extends Thread {
	@Override
	public void run() {
		for(int x =0 ;x<100;x++) {
			System.out.println(getName()+":"+x+"Date:"+new Date());

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
