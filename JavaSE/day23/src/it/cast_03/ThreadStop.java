package it.cast_03;

import java.util.Date;

public class ThreadStop extends Thread {
	public void run() {
		System.out.println("��ʼִ�У�" + new Date());
		for(int x =0 ;x<100;x++) {
			System.out.println(getName()+":"+x);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("�̱߳���ֹ��");
			}
			System.out.println("����ִ�У�" + new Date());
		}
	}
}
