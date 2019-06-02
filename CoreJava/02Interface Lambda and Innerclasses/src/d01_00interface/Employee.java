package d01_00interface;

public class Employee implements Comparable<Employee> {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void raiseSalary(double percent) {
		double raise = salary*percent/100;
		salary += raise;
	}
	

	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Double.compare(salary, o.salary);
	}



}
