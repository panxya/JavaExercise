package it.cast_01;

public class SellTicketsDemo {
	public static void main(String[] args) {
		SellTickets st = new SellTickets();
		
		Thread t1 = new Thread(st,"һ�ſ�") ;
		Thread t2 = new Thread(st,"���ſ�") ;
		
		t1.start();
		t2.start();
	}
}
