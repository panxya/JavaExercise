package d06_00package;
import java.time.*;

public class Employee {
	private String name;
	private LocalDate hireDay;
	
	public Employee(String name,int year,int month ,int day) {
		this.name = name;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	
}
