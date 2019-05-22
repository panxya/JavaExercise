package it.cast_06;

public class SellTickets implements Runnable {

	private int tickets = 100;
	public void run() {
		while(true) {
			if(tickets >0) {
				System.out.println(Thread.currentThread().getName()+"这是第"+(tickets--)+"张票");
			}
		}
	}

}
