/*

类：员工
成员变量： 员工编号  姓名  年龄
成员方法： get set show 
构造方法：无参

*/

class Employee {

	private String ID;
	private String name;
	private int age;
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getID() {
		return (ID);
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return (name);
	}
	
	public void setAge(int age) {
		this.age =  age;
	}
	
	public int getAge() {
		return (age);
	}
	

	public void show() {
		System.out.println("员工编号为："+ID+"姓名是："+name+"年龄为："+age);
	
	}
	
}


class EmployeeTest{
	public static void main(String[] args) {
	//创建对象
		Employee e = new Employee();
		
	//赋值
		e.setID("123455");
		e.setName("王");
		e.setAge(22);
		e.show();
		
		
	
	
	}


}
