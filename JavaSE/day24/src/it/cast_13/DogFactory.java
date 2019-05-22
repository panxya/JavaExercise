package it.cast_13;

public class DogFactory implements Factory {

	@Override
	public Animal animalCreat() {
		
		return new Dog();
	}

}
