package d03_00static_methods;
/**
 * This program demonstrates static methods.
 * @author ะกั๎
 * @version V1.1
 */
public class StaticMethodsDemo {
	public static void main(String[] args) {
		//fill staff array with three Employee Objects.
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Jim",50000);
		staff[1] = new Employee("Tony",60000);
		staff[2] = new Employee("Sarach",65000);
		
		//print out information about all Employee objects
		for(Employee e:staff) {
			e.setId();
			System.out.println("name="+e.getName()+",id=" +e.getId()+",salsry="
					+e.getSalary());
		int n = Employee.getNextId();
		System.out.println("Next available id="+n);
		}
	}
}
