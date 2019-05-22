//升降猫狗 共四类

//父类
class Animal {
	public void eat() {
		System.out.println("eat");
	}
}

//定义猫
class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eat.");
	}
	public void playGame() {
		System.out.println("Cat play game.");
	}
}

//定义狗
class Dog extends Animal {
	public void eat() {
		System.out.println("Dog eat.");
	}
	public void guard() {
		System.out.println("Dog guard.");
	}
}



class AnimalDemo2 {
	public static void main(String[] args) {
		//向上转型
		Animal a = new Dog();
		a.eat();
		Dog d = (Dog) a;
		d.eat();
		d.guard();
		
		a = new Cat();
		a.eat();
		Cat c = (Cat) a;
		c.eat();
		c.playGame();
		
	
	}
}