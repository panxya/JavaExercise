/*
猫狗 动物类

成员变量：年龄 姓名
构造方法：有参无参
成员方法：吃饭（猫狗不一致）

*/

abstract class Animal {
	private int age;
	private String name;
	
	public Animal() {}
	public Animal(int age,String name) {
		this.name = name;
		this.age = age;
	}
	
	//成员方法
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
	//定义一个抽象方法
	public abstract void eat();
}

//猫
class Cat extends Animal{
	public Cat() {}
	public Cat(int age,String name) {
		super(age,name);
	}
	public void eat() {
		System.out.println("Cat can eat fish.");
	}
}
//狗类
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
	//方法一
	Cat c = new Cat();
	c.setAge(11);
	c.setName("小黑");
	System.out.println("姓名："+c.getName()+"，年龄："+c.getAge());
	c.eat();
	
	//方法二
	Dog d = new Dog(5,"小明");
	System.out.println("姓名："+d.getName()+"，年龄："+d.getAge());
	d.eat();
	
	
	//方法三
	Animal a = new Dog();
	a.setAge(6);
	a.setName("小华");
	System.out.println("姓名："+a.getName()+"，年龄："+a.getAge());
	a.eat();
	
	
	Animal aa = new Cat(12,"小白");
	System.out.println("姓名："+aa.getName()+"，年龄："+aa.getAge());
	aa.eat();
	}

}



