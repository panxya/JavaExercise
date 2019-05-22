package d02_00clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable {
	private String name;
	private double salary;
	private Date hireDay;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDay = new Date();
	}
	
	@Override
	public Employee clone() throws CloneNotSupportedException {
		Employee cloned = (Employee) super.clone();
		cloned.hireDay= (Date)hireDay.clone();
		return cloned;//clone mutable filed
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setHireDay(int year ,int month,int day) {
		Date newHireDay = new GregorianCalendar(year,month-1,day).getTime();
		
	//Example of instance field mutation 
		hireDay.setDate((int) newHireDay.getTime());
	}
	
	public void raiseSalary(double byPercent) {
		double raise =  salary*byPercent/100;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + "]";
	}
	
	
	
}
