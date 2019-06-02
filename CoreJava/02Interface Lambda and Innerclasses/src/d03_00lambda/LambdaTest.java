package d03_00lambda;

import java.util.Arrays;
import java.util.Date;


import javax.swing.*;

public class LambdaTest {
	public static void main(String[] args) {
		String[] s = {"ÁÖÁÖ","ÁÕÁÕ","ÁÜÁÜ","ÁØÁØ","÷ë÷ë","ê¥ê¥"};
		System.out.println(Arrays.toString(s));
		
		Arrays.sort(s);
		System.out.println("sort:"+Arrays.toString(s));
		
		Arrays.sort(s, (first,second) -> first.length() - 
				second.length());
		System.out.println("sorted by length:"+Arrays.toString(s));
		
		Timer t = new Timer(1000,event ->
			System.out.println("The time is "+ new Date()));

		t.start();
		
		
		//keep program running until user select "ok".
		JOptionPane.showMessageDialog(null, "Quit Program?");
		
		System.exit(0);
	}
}
