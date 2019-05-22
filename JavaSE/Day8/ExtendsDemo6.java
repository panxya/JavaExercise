//无参和带参在继承中的继承
//父类
class Father {
	public Father() {
		System.out.println("这是无参父类");
	}

	public Father(String name){
		System.out.println("这是带参父类");
	}
	
	
	
}


class Son extends Father {
	public Son(){
		System.out.println("这是一个无参子类");
	}
	
	public Son(String name){
		System.out.println("这是一个带参子类");
	}
	
}

class ExtendsDemo6 {
	public static void main(String[] args) {
		Son s = new Son();
		Son s1 = new Son("效率");
	}
}