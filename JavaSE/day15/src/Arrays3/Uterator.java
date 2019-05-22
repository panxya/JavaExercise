package Arrays3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Uterator {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(" we win.");
		c.add("we play.");
		c.add("we set.");
		c.add("we are the one.");
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		
	}
}
