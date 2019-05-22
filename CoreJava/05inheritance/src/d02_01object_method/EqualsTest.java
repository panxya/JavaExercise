package d02_01object_method;
/**
 * this program demonstrates equals
 * @author ะกั๎
 * @version V1.21
 */
public class EqualsTest {
	public static void main(String[] args) {
		Employee alice1 = new Employee("Alice",60000,1999,12,12);
		Employee alice2 = new Employee("Alice",60000,1999,12,12);
		Employee alice3 = new Employee("Alice",70000,1989,12,12);
		Employee bob = new Employee("Bob",50000,1979,12,12);
		
		System.out.println(alice1==alice2);
		System.out.println(alice1==alice3);
		System.out.println("equals");
		System.out.println(alice1.equals(alice2));
		System.out.println(alice1.equals(alice3));
		System.out.println(alice1.equals(bob));
		
		Manager m = new Manager("Mike",90000,1881,12,22);
		Manager m1 = new Manager("Mike",90000,1881,12,22);
		m1.setBonus(1000);
		
		System.out.println();
		
		System.out.println(m.equals(m1));
		System.out.println(m1);
		System.out.println(alice1.hashCode());
		System.out.println(alice2.hashCode());
		System.out.println(alice3.hashCode());
		System.out.println(m.hashCode());
		System.out.println(m1.hashCode());
		
	}
}
