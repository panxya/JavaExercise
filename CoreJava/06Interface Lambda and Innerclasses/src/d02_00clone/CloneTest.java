package d02_00clone;

/**
 * this program demonstrates cloning.
 * 
 * @author ะกั๎
 * @version V1.0
 */
public class CloneTest {
	public static void main(String[] args) {
		try {
			Employee e = new Employee("e", 10000);
			e.setHireDay(2000, 1, 12);
			Employee ee = e.clone();
			ee.raiseSalary(10);
			ee.setHireDay(2002, 11, 12);
			System.out.println("e" + e);
			System.out.println("ee" + ee);
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
