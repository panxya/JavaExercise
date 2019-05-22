//è���Ķ�̬
//������  ���෽�� �̳�  ������д ������ ����

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
	private AnimalTool() {}  //���������Ա���� �ɹ� �򷽷��Ľ�Ϊ��̬�����ֱ��ͨ���������á�
	public static void toolUse(Animal a) {
		a.eat(); //��
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
����ת�ͣ�
Fu f = new Zi;
����ת�ͣ�

Zi z = (Zi) f;

*/