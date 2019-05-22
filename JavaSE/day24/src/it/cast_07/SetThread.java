package it.cast_07;

public class SetThread implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {

			if (x % 2 == 0) {
				s.set("аж", 22);
			} else {
				s.set("ui", 5);
			}
			x++;
		}
	}
}
