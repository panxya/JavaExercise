package List;

public class StakeDemo {

	public static void main(String[] args) {
		Mystake a =new Mystake();
		a.add("we");
		a.add("hhh");
		a.add("jjjjj");
		
		while(!a.isEmpty()) {
			System.out.println(a.get());
		}
		
	}
}
