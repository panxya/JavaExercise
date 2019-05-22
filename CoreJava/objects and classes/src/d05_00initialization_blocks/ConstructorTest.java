package d05_00initialization_blocks;
/**
 * 
 * demonstrates object construction,
 * @author ะกั๎
 * @version
 */

public class ConstructorTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Harry",60000);
		staff[1] = new Employee(65000);
		staff[2] = new Employee();
		
		for(Employee e :staff) {
			System.out.println("name:"+e.getName()+",salarys:"+
		e.getSalary()+",id:"+e.getId());
		}
		
	}
}
