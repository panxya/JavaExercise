package it.cast_07;

public class SellTicketsDemo {
	public static void main(String[] args) {
		SellTickets st = new SellTickets();
		Thread t1 = new Thread(st,"一号窗口");
		Thread t2 = new Thread(st,"二号窗口");
		
		t1.start();
		t2.start();
		
	}
}
