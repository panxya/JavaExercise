package it.cast_04;

public class SetThread implements Runnable {
	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (s.flag) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				if (x % 2 == 0) {
					
					s.name = "주주";
					s.age = 100;
				} else {
					
					s.name = "영영";
					s.age = 10;
				}
				x++;
				s.flag = true;
				s.notify();

			}

		}
	}

}
