//���������ڿ����е�ʹ��

interface Person{
	public abstract void study();
}

class PersonDemo {
	public void method(Person p) {
		p.study();
	}
}
//ʵ����
class Student implements Person {
	public void study() {
		System.out.println("�ú�ѧϰ,��������");
	}
}

class InnerClassTest2 {
	public static void main(String[] args) {
	PersonDemo pd = new PersonDemo();
	pd.method(new Person(){
			public void study() {
				System.out.println("�ú�ѧϰ,��������");
			}
		});
	

	
	
	}
	
	
}	