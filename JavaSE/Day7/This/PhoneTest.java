class Phone{
	
	//�̱�
	private String brand;
	//��ɫ
	private String color;
	//�۸�
	private int price;
	
	//�̱�
	public String getBrand() {
		return brand;
		} 
	public void setBrand(String brand) {
		this.brand = brand;
		}
	//��ɫ	
	public String getColor() {
		return color;
		} 
	public void setColor(String color) {
		this.color = color;
		}
	
	//�۸�
		
		public int getPrice() {
		return price;
		} 
	    public void setPrice(int price) {
		this.price = price;
		
		}	
	
}


class PhoneTest {
	public static void main(String[] args) {
		Phone s = new Phone();
		s.setBrand("ƻ��");
		s.setColor("�ڽ�");
		s.setPrice(6999);
	
		System.out.println(s.getBrand()+"----"+s.getColor()+"-------"+s.getPrice());
		}
	}
