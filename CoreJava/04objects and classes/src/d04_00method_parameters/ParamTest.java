package d04_00method_parameters;

/**
 * This program demonstrates parameter passing in Java.
 * 
 * @author ะกั๎
 * @version V1.0
 */
public class ParamTest {
	public static void main(String[] args) {
		/*
		 * Test 1:Methods can't modify the parameter.
		 */
		double percent = 10;
		System.out.println("Before:" + percent);
		tirplevalue(percent);
		System.out.println("After:" + percent);

		/*
		 * Test 2 :Methods can modify the parameter.
		 */
		Employee e = new Employee("Harry", 10000);
		System.out.println("Before:salary=" + e.getSalary());
		triplevalue(e);
		System.out.println("After:salary=" + e.getSalary());

		/*
		 * Test 3 :Methods can't attach new objects to object parameter.
		 */
		System.out.println("\nTesting swap:");
		Employee a = new Employee("Alice", 70000);
		Employee b = new Employee("Bob", 60000);
		System.out.println("a Before:"+a.getName()+a.getSalary());
		System.out.println("b Before:"+b.getName()+b.getSalary());
		swap(a,b);
		System.out.println("a After:"+a.getName()+a.getSalary());
		System.out.println("b After:"+b.getName()+b.getSalary());
	}

	private static void swap(Employee a, Employee b) {
		Employee temp = a;
		a=b;
		b=temp;
		System.out.println("a After methods:"+a.getName()+a.getSalary());
		System.out.println("b After methods:"+b.getName()+b.getSalary());
	}

	private static void triplevalue(Employee e) {
		e.raiseSalary(200);

	}

	private static void tirplevalue(double percent) {
		percent *= 3;
		System.out.println("End of methods:" + percent);
	}
}
