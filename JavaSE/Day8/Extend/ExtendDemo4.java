//需求：成员变量的使用关系  使用顺序 同名呢？不同名呢？
//子类局部范围-子类成员范围-父类成员范围
class Extend4 {
	//父类成员范围
	int num = 11;
	int num1 = 22;
	//父类成员方法
	public void show(){
		int num = 33;
		System.out.println(num);
	}
	//父类方法
	public void show1(){
		System.out.println(num);	
	}

}
//子类
class Extend41 extends Extend4{
	public void time() {
		System.out.println(num);
	}
}

class ExtendDemo4 {
	public static void main(String[] args) {
		Extend41 e = new Extend41();
		e.time();//55
		e.show1();//11
		e.show();//33
		
	}

}