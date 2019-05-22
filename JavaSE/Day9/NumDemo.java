class Demo {
	int num = 20;
	final int num2;
	
	//{
	//	num2 = 50;
	//}
	
	public Demo() {
		num = 22;
		num2 = 50;
		System.out.println(num2);
		System.out.println(num);	
	}

}


class NumDemo {
	public static void main(String[] args) {
		Demo s = new Demo();
	}

}