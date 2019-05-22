/*
	定义人类
	成员变量：姓名 年龄 国籍

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
		System.out.println("姓名："+name+"，年龄"+age+"，国籍"+country);
	
	}

}


class PersonDemo {
	public static void main(String[] args) {
		Person a = new Person("林林",22,"中国");
		a.show();
		
		Person b = new Person("田田",45);
		b.show();
		
		Person c = new Person("渊源",56);
		b.show();
	
	}


}