package it.cast_01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTickets implements Runnable {
	private int tickets = 100;
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		while(true) {
			try {
				lock.lock();
				if(tickets>0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"���۵�"+(tickets--)+"��");
				}
			} finally {
				lock.unlock();
			}
			
			
		}

	}

}
