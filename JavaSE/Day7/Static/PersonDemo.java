/*
	��������
	��Ա���������� ���� ����

*/
class Person {
	int age;
	String name;
	static String country;
	
	public Person() {}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	
	}
	public Person(String name,int age,String country){
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void show() {
		System.out.println("������"+name+"������"+age+"������"+country);
	
	}

}


class PersonDemo {
	public static void main(String[] args) {
		Person a = new Person("����",22,"�й�");
		a.show();
		
		Person b = new Person("����",45);
		b.show();
		
		Person c = new Person("ԨԴ",56);
		b.show();
	
	}


}