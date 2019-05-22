package for2;

import java.util.ArrayList;

public class formac {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 23, 45, 22, 44, 23 };
		for (int x : arr) {
			System.out.println(x);
		}
		
		System.out.println("_____________");
		
		String[] str={"ÁÖÁÖ","ÁÕÁÕ","ÁÜÁÜ","ÁØÁØ"};
		for(String s:str) {
			System.out.println(s);
		}
		
		ArrayList<String> aee = new ArrayList<String>();
		aee.add("¹ø¹ø");
		aee.add("òåòå");
		aee.add("¹û¹û");
		for(String a :aee) {
			System.out.println(a);
		}
		
		
		
		
	}

}
