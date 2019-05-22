package d05_03methods;

import java.time.LocalDate;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name,double salary,int year,int month ,int day) {
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}

	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDate() {
		return hireDay;
	}
	
	public void raiseSalary(double percent) {
		double raise = salary*percent/100;
		salary += raise;
		System.out.println(salary);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hireDay == null) ? 0 : hireDay.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (hireDay == null) {
			if (other.hireDay != null)
				return false;
		} else if (!hireDay.equals(other.hireDay))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + "]";
	}
	
	
	
	
	
}
