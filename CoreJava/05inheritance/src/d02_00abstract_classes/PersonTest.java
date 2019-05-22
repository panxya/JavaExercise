package d02_00abstract_classes;

public class PersonTest {
	public static void main(String[] args) {
		Person[] p = new Person[2];
		p[0] = new Student("ажаж","Math");
		p[1] = new Employee("Alice",60000,1990,12,22);
		
		for(Person a :p) {
			System.out.println(a.getName()+" "+a.getDescription());
		}
	}
}
