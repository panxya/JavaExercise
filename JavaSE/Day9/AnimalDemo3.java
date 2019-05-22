//抽象类
//子类抽象且不抽象
//调用
abstract class Animal {
	public void Animal () {}
	public abstract void see();
}

abstract class Cat extends Animal{}

class Dog extends Animal{
	public void see() {
		System.out.println("Cat can see.");
	}
}

class AnimalDemo3{
	public static void main(String[] args) {
		Animal a = new Dog();
		a.see();
	
	}

}