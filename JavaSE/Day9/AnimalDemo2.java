//����è�� ������

//����
class Animal {
	public void eat() {
		System.out.println("eat");
	}
}

//����è
class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eat.");
	}
	public void playGame() {
		System.out.println("Cat play game.");
	}
}

//���幷
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
		//����ת��
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