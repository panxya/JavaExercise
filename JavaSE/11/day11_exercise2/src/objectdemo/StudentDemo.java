package objectdemo;

public class StudentDemo extends Student  {
	public static void main(String[] args) {
		
		Student a = new Student("С��",22);
		System.out.println(a.hashCode());
		System.out.println(a.getClass());
		System.out.println(a.toString());
		
		
		Student b = new Student("С��",22);
		System.out.println(b.equals(a));
	}
	
}
