//苹果三星测评
/*
手机类
成员变量： name price color
构造方法：set get 
成员方法： call

苹果的成员方法：装逼
三星的成员方法：砸核桃
*/

class Phone {
	private String name;
	private int price;
	private String color;
	
	public Phone() {}
	public Phone(String name,int price,String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}




class Apple extends Phone {
	public Apple() {}
	public Apple(String name,int price,String color) {
		super(name,price,color);
	}
	
	public void PlayGame(){
		System.out.println("I can play games.");
	}
}


class Nokya extends Phone {
	public Nokya() {}
	public Nokya(String name,int price,String color) {
		super(name,price,color);
		
	}
	
	public void BumpApple() {
		System.out.println("I can bump Apple.");
	}
}


class ExtendsDemo12 {
	public static void main(String[] args) {
		Nokya s = new Nokya();
		s.BumpApple();
		s.setName("诺基亚");
		s.setPrice(1009);
		s.setColor("黑色");
		System.out.println("手机名："+s.getName()+"，手机价格："+s.getPrice()+"，手机颜色"+s.getColor());
	
		Apple a = new Apple("苹果",6999,"土豪金");
		System.out.println("手机名："+a.getName()+"，手机价格："+a.getPrice()+"，手机颜色"+a.getColor());
	
	
	}
}