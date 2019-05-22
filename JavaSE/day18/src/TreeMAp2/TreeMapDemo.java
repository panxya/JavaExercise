package TreeMAp2;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		String a = "sjdiufjfg";
		
		char[] ch = a.toCharArray();
		
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		for(char ch1 : ch) {
			Integer it =  tm.get(ch1);
			if(it == null) {
				tm.put(ch1, 1);
			}else {
				it++;
				tm.put(ch1, it);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		Set<Character> set = tm.keySet();
		for(Character key :set) {
			Integer value = tm.get(key);
			sb.append(key).append(value);
		}
		String ab = sb.toString();
		System.out.println(ab);
	}
}
