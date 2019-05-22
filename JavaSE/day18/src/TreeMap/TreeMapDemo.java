package TreeMap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your String.");
		String s = sc.nextLine();
		
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		char[] c = s.toCharArray();
		
		for(char c1 :c) {
			Integer a = tm.get(c1);
			if(a == null) {
				tm.put(c1, 1);
			}else {
				a++;
				tm.put(c1, a);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		Set<Character> set = tm.keySet();
		for(Character key : set) {
			Integer value = tm.get(key);
			sb.append(key).append("(").append(value).append(")");
		}
		
		
		
		String sss = sb.toString();
		System.out.println(sss);
	}
	
}
