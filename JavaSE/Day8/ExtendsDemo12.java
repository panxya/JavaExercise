//ƻ�����ǲ���
/*
�ֻ���
��Ա������ name price color
���췽����set get 
��Ա������ call

ƻ���ĳ�Ա������װ��
���ǵĳ�Ա�������Һ���
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
		s.setName("ŵ����");
		s.setPrice(1009);
		s.setColor("��ɫ");
		System.out.println("�ֻ�����"+s.getName()+"���ֻ��۸�"+s.getPrice()+"���ֻ���ɫ"+s.getColor());
	
		Apple a = new Apple("ƻ��",6999,"������");
		System.out.println("�ֻ�����"+a.getName()+"���ֻ��۸�"+a.getPrice()+"���ֻ���ɫ"+a.getColor());
	
	
	}
}