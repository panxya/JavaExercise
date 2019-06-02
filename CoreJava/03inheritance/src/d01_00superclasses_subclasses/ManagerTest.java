package d01_00superclasses_subclasses;
/**
 * This program demonstrates inheritance.
 * @author ะกั๎
 * @version V2.1
 */
public class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager("Cars" ,80000,1987,11,23);
		m.setBonus(6000);
		
		Employee[] staff = new Employee[3];
		staff[0] = m;
		staff[1] = new Employee("Jim", 50000, 1990, 1, 4);
		staff[2] = new Employee("Alice", 55000, 1994, 8, 12);
		for(Employee e :staff) {
			System.out.println(e.getName()+" "+e.getSalary()+" ");
		}
	}
}
