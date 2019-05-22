package it.cast_03;

import java.util.Date;

public class ThreadStop extends Thread {
	public void run() {
		System.out.println("开始执行：" + new Date());
		for(int x =0 ;x<100;x++) {
			System.out.println(getName()+":"+x);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("线程被终止了");
			}
			System.out.println("结束执行：" + new Date());
		}
	}
}
