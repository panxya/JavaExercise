package it.cast_03;

public class SetThread implements Runnable {
	private Student s;

	public SetThread(Student s) {
		this.s = s;
	}

	int x = 0;
	@Override
	public void run() {
		while(true) {
			synchronized (s) {
				if(x%2==0){
					s.age = 100;
					s.name = "주주";
				}else {
					s.age = 10;
					s.name = "영영";
				}
				x++;
			}
			
			
		}
	}

}
