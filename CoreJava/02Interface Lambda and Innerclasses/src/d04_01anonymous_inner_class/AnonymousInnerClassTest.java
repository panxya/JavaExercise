package d04_01anonymous_inner_class;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * this program demonstrates the use of inner classes 
 * @author 小杨
 * @version V1.0
 */
public class AnonymousInnerClassTest {
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock();
		clock.start(1000,true);
		
		//keep program running until user select "ok"
		JOptionPane.showInternalMessageDialog(null, "Quit program?");//提示窗口
		System.exit(0);
	}
}
/**
 * a clock that prints the time in regular intervals.
 * @author 小杨
 *
 */
	class TalkingClock{
//		这是没有匿名内部类时的，程序报错
//		private int interval;
//		private boolean beep;
//		/**
//		 * constructs a talking clock 
//		 * @param interval between messages
//		 * @param beep true if the clock should beep
//		 */
//		public TalkingClock(int interval,boolean beep) {
//			this.interval = interval;
//			this.beep = beep;
//		}
//		
		/**
		 * start it
		 */
		public void start(int interval ,boolean beep) {
			ActionListener listener = new ActionListener() {
				
				public void actionPerformed(ActionEvent event) {
					System.out.println("At the tone ,the time is"+new Date());
					if(beep) {
						Toolkit.getDefaultToolkit().beep();}
				}
				
			};
			Timer t = new Timer(interval,listener);
			t.start();
		}
	}
	/*	
	
	
	报错
	public class TimePrinter implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			System.out.println("At the tone ,the time is"+new Date());
			if(TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
		}
	}
	
	*/