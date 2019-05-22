//匿名对象在开发中的使用

interface Person{
	public abstract void study();
}

class PersonDemo {
	public void method(Person p) {
		p.study();
	}
}
//实现类
class Student implements Person {
	public void study() {
		System.out.println("好好学习,天天向上");
	}
}

class InnerClassTest2 {
	public static void main(String[] args) {
	PersonDemo pd = new PersonDemo();
	pd.method(new Person(){
			public void study() {
				System.out.println("好好学习,天天向上");
			}
		});
	

	
	
	}
	
	
}	