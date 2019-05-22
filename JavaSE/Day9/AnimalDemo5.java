/*
è�� ������

��Ա���������� ����
���췽�����в��޲�
��Ա�������Է���è����һ�£�

*/

abstract class Animal {
	private int age;
	private String name;
	
	public Animal() {}
	public Animal(int age,String name) {
		this.name = name;
		this.age = age;
	}
	
	//��Ա����
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	//����һ�����󷽷�
	public abstract void eat();
}

//è
class Cat extends Animal{
	public Cat() {}
	public Cat(int age,String name) {
		super(age,name);
	}
	public void eat() {
		System.out.println("Cat can eat fish.");
	}
}
//����
class Dog extends Animal{
	public Dog() {}
	public Dog(int age,String name) {
		super(age,name);
	}

	public void eat() {
		System.out.println("Dog can eat meat.");
	}
}

class AnimalDemo5 {
	public static void main(String[] args) {
	//����һ
	Cat c = new Cat();
	c.setAge(11);
	c.setName("С��");
	System.out.println("������"+c.getName()+"�����䣺"+c.getAge());
	c.eat();
	
	//������
	Dog d = new Dog(5,"С��");
	System.out.println("������"+d.getName()+"�����䣺"+d.getAge());
	d.eat();
	
	
	//������
	Animal a = new Dog();
	a.setAge(6);
	a.setName("С��");
	System.out.println("������"+a.getName()+"�����䣺"+a.getAge());
	a.eat();
	
	
	Animal aa = new Cat(12,"С��");
	System.out.println("������"+aa.getName()+"�����䣺"+aa.getAge());
	aa.eat();
	}

}



