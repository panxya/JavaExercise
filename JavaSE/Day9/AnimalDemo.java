//猫狗的多态
//创建类  父类方法 继承  方法重写 工具类 测试

class Animal {
	
	public void eat() {
		System.out.println("Can eat.");
	}
	
	public void sleep() {
		System.out.println("Can sleep.");
	}
}


class Dog extends Animal {
	public void eat() {
		System.out.println("Dog eat meet.");
	}
	
	public void sleep() {
		System.out.println("Dog sleep on the floor.");
	}

}


class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eat fish.");
	}
	public void sleep() {
		System.out.println("Cat sleep with dog.");
	}
}


class AnimalTool {
	private AnimalTool() {}  //访问他类成员方法 成功 因方法改进为静态后可以直接通过类名调用。
	public static void toolUse(Animal a) {
		a.eat(); //？
		a.sleep();
	}
}


class AnimalDemo {
	public static void main(String[] args) {
		Cat c = new Cat();
		AnimalTool.toolUse(c);
		Dog d = new Dog();
		AnimalTool.toolUse(d);
	
	}
}



/*
向上转型：
Fu f = new Zi;
向下转型：

Zi z = (Zi) f;

*/