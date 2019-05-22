package it.cast_05;

public class SellTicket extends Thread {
	public static int ticketsNum = 100;
	@Override
	public void run() {
		while(true) {
			if(ticketsNum>0) {
				System.out.println(getName()+"这是第"+(ticketsNum--)+"张");
			}
		}
	}
}
