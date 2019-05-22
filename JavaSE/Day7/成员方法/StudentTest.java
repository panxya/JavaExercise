class Student {
	public void show() {
		System.out.println("呵呵");
	}
	
	public String getString() {
		return "我的天呐";
	
	}
	
	public void method(String a) {
		System.out.println(a);
	}

	
	public String function(String b,String c) {
		return c+b;
	}


}


class StudentTest {
	public static void main(String[] args) {
	Student s = new Student();
	s.show();
	
	String result = s.getString();
	System.out.println(result);
	
	
	s.method("小林");
	
	String result2 = s.function("芳芳","林林");
	System.out.println(result2);
	}






}