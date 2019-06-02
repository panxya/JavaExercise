package d01_00interface;

import java.util.Arrays;

public class InterfaceTest {
	public static void main(String[] args) {
		Employee staff[] = new Employee[3];
		staff[0] = new Employee("Tom",60000);
		staff[1] = new Employee("Jack",70000);
		staff[2] = new Employee("Lucy",55000);
		
		
		Arrays.sort(staff);
		
		for(Employee e :staff) {
			System.out.println("name="+e.getName()+",salary"+e.getSalary());
		}
		
	}
}
