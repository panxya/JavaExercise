package it.cast_07;

public class SellTicketsDemo {
	public static void main(String[] args) {
		SellTickets st = new SellTickets();
		Thread t1 = new Thread(st,"һ�Ŵ���");
		Thread t2 = new Thread(st,"���Ŵ���");
		
		t1.start();
		t2.start();
		
	}
}
