package d02_00abstract_classes;

public abstract class Person {
	public abstract String getDescription();
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
