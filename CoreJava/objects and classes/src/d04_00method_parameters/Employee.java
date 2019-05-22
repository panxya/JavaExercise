package d04_00method_parameters;

public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name,double salary) {
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
		
		salary = salary*(1+(percent/100));
	}
}
