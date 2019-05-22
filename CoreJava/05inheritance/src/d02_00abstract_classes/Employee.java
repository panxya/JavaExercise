package d02_00abstract_classes;

import java.time.LocalDate;

public class Employee extends Person {
	private double salary;
	private LocalDate hireDay;
	
	
	
	public Employee(String name, double salary, int year,int month,int day) {
		super(name);
		this.salary = salary;
		hireDay=LocalDate.of(year, month, day);
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}


	public String getDescription() {

		return String.format("an employee with a salary of$%.2f",salary);
	}
	
	public void raiseSalary(double Percent) {
		double raise = salary*Percent/100;
		salary += raise;
	}

}
