package d02_00abstract_classes;

public class Student extends Person {
	private String major;
	/**
	 * 
	 * @param name student 'name
	 * @param major student'major
	 */
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public String getDescription() {
		
		return "a student majoring in :"+major;
	}

}
