class Student {

	private String name;
	private int age;
	
	//获取姓名值

	public String getName() {
		return name;
	}
	//设置姓名值
	public void setName(String n) {
		name = n;
	}
	
	//获取值
	public int getAge() {
		return age;
	}
	//赋值
	public void setAge(int a) {
		age = a;
		
	}
}

class StudentDemo {
	public static void main(String[] args) {
		
		//创建学生对象
		Student d = new Student();
		//使用成员变量
		System.out.println(d.getName()+"---"+d.getAge());

		
		d.setName("林");
		d.setAge(88);
		System.out.println(d.getName()+"---"+d.getAge());
		
		}
			
	}

