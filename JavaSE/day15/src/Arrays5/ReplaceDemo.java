package Arrays5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReplaceDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("I");
		list.add("Love");
		list.add("You.");
		
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) { 
			String s = (String) lit.next();
			if("I".equals(s)) {
				lit.add("did");
			}
			
		}
	System.out.println(list);	
	}
}
