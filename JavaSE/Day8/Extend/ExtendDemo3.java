//不能继承私有成员变量与成员方法，但可以通过公共方法去方未能私有变量

class Extend3 {
	private int num = 1;
	int num1 = 2;
	
	
	//成员方法使用私有变量
	
	public void show() {
		System.out.println("You can use it.");
		System.out.println(num1);
		System.out.println(num);	
	}

}

//继承
class Student extends Extend3 {
	public void function() {
		System.out.println(num1);
	}
}

//使用方法了 main
class ExtendDemo3 {
	public static void main(String[] args) {
	Student s = new Student();	
	s.show();
	s.function();
	
	
	}

}