package d02_00employee;

import java.time.LocalDate;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Amy", 75000,1980,12,22);
		staff[1] = new Employee("John", 66000,1990,4,23);
		staff[2] = new Employee("Adam", 66000,1999,10,7);
		
		//raise
		for(Employee e: staff) {
			e.raiseSalary(5);
		}
		
		for(Employee e: staff) {
			System.out.println("name:"+e.getName()+",salary:"+e.getSalary()
					+",hireDay:"+e.getHireDay());
		}
		
	}
	
}
