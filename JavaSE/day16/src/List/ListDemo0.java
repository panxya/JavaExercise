package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo0 {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("We");
		list.add("are");
		list.add("one.");
		
		Iterator it= list.iterator();
		
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
 	
	System.out.println("-----");
	
		for(int x=0; x<list.size();x++) {
			String a = (String)list.get(x);
			System.out.println(a);
		}
	
	
	}
}
