package it.cast_13;

public class AnimalDemo {
	
	public static void main(String[] args) {
		Factory f = new DogFactory();
		Animal a = f.animalCreat();
		a.eat();
		
		f=new CatFactory();
		a=f.animalCreat();
		a.eat();
	}
	
	
			
}
