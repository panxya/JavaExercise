class Phone{
	
	//商标
	private String brand;
	//颜色
	private String color;
	//价格
	private int price;
	
	//商标
	public String getBrand() {
		return brand;
		} 
	public void setBrand(String brand) {
		this.brand = brand;
		}
	//颜色	
	public String getColor() {
		return color;
		} 
	public void setColor(String color) {
		this.color = color;
		}
	
	//价格
		
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
		s.setBrand("苹果");
		s.setColor("黑金");
		s.setPrice(6999);
	
		System.out.println(s.getBrand()+"----"+s.getColor()+"-------"+s.getPrice());
		}
	}
