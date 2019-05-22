package it.cast_03;

public class ThreadJoinDemo {
	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();
		
		
		tj1.setName("ц╥ц╥");
		tj2.setName("ажаж");
		tj3.setName("╧Ч╧Ч");
		
		tj1.start();
		try {
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tj2.start();
		tj3.start();
		
	}
	
	
}
