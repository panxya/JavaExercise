package it.cast_02;

public class SetThread implements Runnable {
	private Student s;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		s.age = 100;
		s.name = "ажаж";

	}

}
