package it.cast_12;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal a = AnimalFactory.creatAnimal("Cat");
		a.eat();
		Animal b = AnimalFactory.creatAnimal("Dog");
		b.eat();
	}
}
