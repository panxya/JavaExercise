class Demo {
 //private����
	private int num = 10;
	
	public void show() {
		System.out.println(num);
		}
	private void method() {
		System.out.println("����");
		}	
	public void function() {
		method();
		}	
 
 
 
}

 class PrivateDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.show();
		d.function();
	}
}