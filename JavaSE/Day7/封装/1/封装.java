class Student {
	//姓名
	String name;
	//年龄
	private int age;
	
	//显示所有成员变量值
	public void show() {
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		}
	//数据校验
	public void SetAge(int a) {
		if(a<0 || a>128) {
			System.out.println("有误");
	
		}else {
			age = a;
			}
		}
}

class StudentDemo {
	public static void main(String[] agrs) {
	Student s = new Student();
	s.show();
	System.out.println("------------");
	//赋值
	s.name = "为";
	s.SetAge(22);
	s.SetAge(1000);
	s.show();
	
	}
}