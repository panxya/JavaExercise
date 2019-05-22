/*
一级：人
	姓名‘年龄
	吃饭（）   睡觉（）｛｝
二级：教练 运动员
	教练吃白菜	运动员吃小鱼
三级：篮球与乒乓球组合
		乒乓球要学英语（接口）
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
	
	//吃饭
	public abstract void eat();
	//睡觉
	public void sleep() {
		System.out.println("We all need sleep.");
	}

}

//运动员
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

//篮球运动员具体类
class BasketballPlayer extends Player {
	public BasketballPlayer() {}
	public BasketballPlayer(String name,int age) {
		super(name,age);
	}
	//吃
	public void eat() {
		System.out.println("BasketballPlayer eat chicken.");
	}
	//学
	public void study() {
		System.out.println("BasketballPlayer study run.");
	}
	
}

//篮球教练具体类
class BasketballCoach extends Coach {
	public BasketballCoach() {}
	public BasketballCoach(String name,int age) {
		super(name,age);
	}
	//吃
	public void eat() {
		System.out.println("BasketballCoach eat apple.");
	}
	//教
	public void teach() {
		System.out.println("BasketballPlayer teach basketball.");
	}
	
}

//乒乓球教练具体类
class PingpangCoach extends Coach implements SpeakingEnglish {
	public PingpangCoach() {}
	public PingpangCoach(String name,int age) {
		super(name,age);
	}
	//吃
	public void eat() {
		System.out.println("PingpangCoach eat pineapple.");
	}
	//教
	public void teach() {
		System.out.println("PingpangCoach teach Pingpangball.");
	}
	//英语
	public void SpeakEnglish() {
		System.out.println("PingpangCoach learn to speak English.");
	}
}

//乒乓球运动员具体类
class PingpangPlayer extends Player implements SpeakingEnglish {
	public PingpangPlayer() {}
	public PingpangPlayer(String name,int age) {
		super(name,age);
	}
	//吃
	public void eat() {
		System.out.println("PingpangPlayer eat fish.");
	}
	//教
	public void study() {
		System.out.println("PingpangPlayer study Pingpangball.");
	}
	//英语
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
		pc.setName("刘国梁");
		pc.setAge(50);
		System.out.println("姓名："+pc.getName()+"，年龄："+pc.getAge());
		System.out.println("-----------------");
		
		BasketballPlayer bp = new BasketballPlayer("姚明",30);
		bp.eat();
		bp.study();
		System.out.println("姓名："+bp.getName()+"，年龄："+bp.getAge());
		System.out.println("-----------------");
		
		
	}
}
