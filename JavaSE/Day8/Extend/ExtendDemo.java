//¼Ì³Ð
class Person {
	public void listen() {
		System.out.println("Ìý¸è");
	}
	
	public void see() {
		System.out.println("¿´º£");
	}
}

class Student extends Person {}
class Teacher extends Person {}

class ExtendDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.listen();
		s.see();
		System.out.println("--------");
		Teacher t = new Teacher();
		t.listen();
		t.see();
	
	}

}