package it.cast_13;

public class CatFactory implements Factory {

	@Override
	public Animal animalCreat() {
		// TODO Auto-generated method stub
		return new Cat();
	}

}
