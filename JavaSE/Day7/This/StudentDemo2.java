class Student {
	private String name;
	private int age;
	//��ȡ����
	public String getName() {
		return name;
		}
	//��ȡ����ֵ
	public void setName(String name) {
		this.name = name;
	}

	//��ȡ����
	public int getAge() {
		return age;
		}
	//��ȡ����ֵ
	public void setAge(int age) {
		this.age = age;
	}
	
}


class StudentDemo2 {
	public static void main(String[] args) {
	
	//��������
	Student n = new Student();
	n.setAge(22);
	n.setName("Ϊ");
	System.out.println(n.getName()+"----------"+n.getAge());
	
	}

}