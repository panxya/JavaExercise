/*假如我们在开发一个系统时需要对员工类进行设计，员工包含3个属性：姓名、工号以及工资。
经理也是员工，除了含有员工的属性外，另为还有一个奖金属性。
请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。

类：员工
成员变量：姓名，工号。工资
构造方法：有参无参
成员方法：工作（不同）

经理成员变量有奖金


*/


abstract class Employee {
	private String name;
	private String id;
	private int salary;
	
	public Employee() {};
	public Employee(String name,String id,int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	
	}
	
	
	public void setName(String namme) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public abstract void work();
	
}


class Worker extends Employee {
	public Worker() {}
	
	public Worker(String name,String id,int salary) {
		super(name,id,salary);
	}
	
	public void work() {
		System.out.println("Worker do formal work.");
	}
	
	
}

class Manager extends Employee {
	private int money;
	
	public Manager() {}
	public Manager(String name,String id,int salary,int money) {
		super(name,id,salary);
		this.money = money;
	}
	
	public void work() {
		System.out.println("Manager help to control resoures.");
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
class EmployeeDemo {
	public static void main(String[] args) {
		Employee e = new Worker();
		e.setName("明明");
		e.setId("20181029");
		e.setSalary(50000);
		System.out.println("姓名："+e.getName()+"，工号："+e.getId()+"，年薪："+e.getSalary());
		e.work();
		
		
		Manager m = new Manager("老明","20181022",880000,20000);
		System.out.println("姓名："+m.getName()+"，工号："+m.getId()+"，年薪："+m.getSalary()+"，奖金："+m.getMoney());
		m.work();
		
	}


}


