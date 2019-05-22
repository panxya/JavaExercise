package d05_00initialization_blocks;

import java.util.Random;

public class Employee {
	private static int nextId;
	private int id;
	private String name = "";
	private double salary; 
	
	static {
		Random a = new Random();
		nextId = a.nextInt(10000);
	}
	
	{
		id = nextId;
		nextId++;
	}
	
	public Employee(String name,double salary) {
		this.name= name;
		this.salary = salary;
	}
	
	public Employee(double salary) {
		this("Employee #"+nextId,salary);
	}
	
	public Employee() {}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}
	
	
}
