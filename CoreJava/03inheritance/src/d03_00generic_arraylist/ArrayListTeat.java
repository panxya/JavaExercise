package d03_00generic_arraylist;

import java.util.ArrayList;
/**
 * this program demonstrates the arraylist class.
 * @author ะกั๎
 * @version V1.22
 */
public class ArrayListTeat {
	public static void main(String[] args) {
		ArrayList<Employee> staff = new ArrayList<>();
		staff.add(new Employee("Susan",60000,1987,12,22)); 
		staff.add(new Employee("Tom",88000,1977,1,2));
		staff.add(new Employee("Jocabs",70000,1987,11,9));
		
		for(Employee e:staff) {
			e.raiseSalary(5);
		}
		
		for(Employee e:staff) {
			System.out.println(e.getName()+" "+e.getSalary()+" "+e.getHireDate());
		}
		
		
		
	}
}
