package hasCode1;

public class Student {
	String name;
	int age;
	
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
//	public int hasCode() {
//		// TODO Auto-generated method stub
//		return this.name.hashCode()+this.age*100;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if (this == obj) {
//			return true;
//		}
//		if(!(obj instanceof Student)) {
//			return false;
//		}
//		Student  s =(Student) obj;
//		return this.name.equals(s.name)&&(this.age==s.age);
//								
//	}
	
	
	
}
