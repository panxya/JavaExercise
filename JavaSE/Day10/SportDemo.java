/*
һ������
	����������
	�Է�����   ˯����������
���������� �˶�Ա
	�����԰ײ�	�˶�Ա��С��
������������ƹ�������
		ƹ����ҪѧӢ��ӿڣ�
*/

interface SpeakingEnglish {
	public abstract void SpeakEnglish();

}

abstract class Person {
	private String name;
	private int age;
	public Person() {}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	//�Է�
	public abstract void eat();
	//˯��
	public void sleep() {
		System.out.println("We all need sleep.");
	}

}

//�˶�Ա
abstract class Player extends Person {
	public Player() {}
	public Player(String name,int age) {
		super(name,age);
	}
	
	public abstract void study();
}

abstract class Coach extends Person {
	public Coach() {}
	public Coach(String name,int age) {
		super(name,age);
	}
	
	public abstract void teach();
}

//�����˶�Ա������
class BasketballPlayer extends Player {
	public BasketballPlayer() {}
	public BasketballPlayer(String name,int age) {
		super(name,age);
	}
	//��
	public void eat() {
		System.out.println("BasketballPlayer eat chicken.");
	}
	//ѧ
	public void study() {
		System.out.println("BasketballPlayer study run.");
	}
	
}

//�������������
class BasketballCoach extends Coach {
	public BasketballCoach() {}
	public BasketballCoach(String name,int age) {
		super(name,age);
	}
	//��
	public void eat() {
		System.out.println("BasketballCoach eat apple.");
	}
	//��
	public void teach() {
		System.out.println("BasketballPlayer teach basketball.");
	}
	
}

//ƹ�������������
class PingpangCoach extends Coach implements SpeakingEnglish {
	public PingpangCoach() {}
	public PingpangCoach(String name,int age) {
		super(name,age);
	}
	//��
	public void eat() {
		System.out.println("PingpangCoach eat pineapple.");
	}
	//��
	public void teach() {
		System.out.println("PingpangCoach teach Pingpangball.");
	}
	//Ӣ��
	public void SpeakEnglish() {
		System.out.println("PingpangCoach learn to speak English.");
	}
}

//ƹ�����˶�Ա������
class PingpangPlayer extends Player implements SpeakingEnglish {
	public PingpangPlayer() {}
	public PingpangPlayer(String name,int age) {
		super(name,age);
	}
	//��
	public void eat() {
		System.out.println("PingpangPlayer eat fish.");
	}
	//��
	public void study() {
		System.out.println("PingpangPlayer study Pingpangball.");
	}
	//Ӣ��
	public void SpeakEnglish() {
		System.out.println("PingpangPlayer learn to speak English.");
	}
}


class SportDemo {
	public static void main(String[] args) {
		PingpangCoach pc = new PingpangCoach();
		pc.eat();
		pc.teach();
		pc.SpeakEnglish();
		pc.setName("������");
		pc.setAge(50);
		System.out.println("������"+pc.getName()+"�����䣺"+pc.getAge());
		System.out.println("-----------------");
		
		BasketballPlayer bp = new BasketballPlayer("Ҧ��",30);
		bp.eat();
		bp.study();
		System.out.println("������"+bp.getName()+"�����䣺"+bp.getAge());
		System.out.println("-----------------");
		
		
	}
}
