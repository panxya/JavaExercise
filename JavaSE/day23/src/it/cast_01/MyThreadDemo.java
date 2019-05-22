package it.cast_01;

public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread my1 = new MyThread("ажаж");
		MyThread my2 = new MyThread("аж");
		
		my1.start();
		my2.start();		
	}
}
