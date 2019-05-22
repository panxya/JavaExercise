package List;

import java.util.LinkedList;

public class Mystake {
	private LinkedList link;

	public Mystake() {

		link = new LinkedList();
	}

	public void add(Object obj) {
		link.addFirst(obj);
	}

	public Object get() {
		return link.removeFirst();
	}

	public boolean isEmpty() {
		return link.isEmpty();
	}
}
