package it.cast_01;

public class SellTicketsDemo {
	public static void main(String[] args) {
		SellTickets st = new SellTickets();
		
		Thread t1 = new Thread(st,"一号口") ;
		Thread t2 = new Thread(st,"二号口") ;
		
		t1.start();
		t2.start();
	}
}
