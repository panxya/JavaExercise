class Student {
	public void show() {
		System.out.println("�Ǻ�");
	}
	
	public String getString() {
		return "�ҵ�����";
	
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
	
	
	s.method("С��");
	
	String result2 = s.function("����","����");
	System.out.println(result2);
	}






}