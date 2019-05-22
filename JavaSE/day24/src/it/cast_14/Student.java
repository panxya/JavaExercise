package it.cast_14;

public class Student {
	private Student () {}
	
	private static Student s = new Student();
	public static Student getStudent() {
		return s;
	} 
	
}
