class Student {
	private String name;
	private int age;
	//获取姓名
	public String getName() {
		return name;
		}
	//获取姓名值
	public void setName(String name) {
		this.name = name;
	}

	//获取年龄
	public int getAge() {
		return age;
		}
	//获取年龄值
	public void setAge(int age) {
		this.age = age;
	}
	
}


class StudentDemo2 {
	public static void main(String[] args) {
	
	//创建对象
	Student n = new Student();
	n.setAge(22);
	n.setName("为");
	System.out.println(n.getName()+"----------"+n.getAge());
	
	}

}