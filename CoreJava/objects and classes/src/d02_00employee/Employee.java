package d02_00employee;

import java.time.LocalDate;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n,double s,int year,int month,int day) {
		name = n;
		salary = s;
		hireDay = hireDay.of(year, month, day);
	}
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double percent) {
		double raise = salary*percent/100;
		salary+= raise;
		
	}
	
}


