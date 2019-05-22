package it.cast_11;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		Timer t =new Timer();
		t.schedule(new MyTimer(),1000,1000);
	}
}
	
class  MyTimer extends TimerTask {
	
		
	public void run() {
		System.out.println("beng,±¨’®¡À");
		
	} 		 
}
