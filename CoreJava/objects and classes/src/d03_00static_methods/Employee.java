package d03_00static_methods;

public class Employee {
	private static int nextid = 1; 
	private String name;
	private double salary;
	private int id;
	public Employee(String name,double salary) {
		this.name=name;
		this.salary =salary;
		id = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		id = nextid;
		nextid++;
	}
	
	public static int getNextId() {
		return nextid;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Harry",50000);
		System.out.println(e.getName()+" "+e.getSalary());
	}
}
