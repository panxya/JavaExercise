/*���������ڿ���һ��ϵͳʱ��Ҫ��Ա���������ƣ�Ա������3�����ԣ������������Լ����ʡ�
����Ҳ��Ա�������˺���Ա���������⣬��Ϊ����һ���������ԡ�
��ʹ�ü̳е�˼����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�

�ࣺԱ��
��Ա���������������š�����
���췽�����в��޲�
��Ա��������������ͬ��

�����Ա�����н���


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
		e.setName("����");
		e.setId("20181029");
		e.setSalary(50000);
		System.out.println("������"+e.getName()+"�����ţ�"+e.getId()+"����н��"+e.getSalary());
		e.work();
		
		
		Manager m = new Manager("����","20181022",880000,20000);
		System.out.println("������"+m.getName()+"�����ţ�"+m.getId()+"����н��"+m.getSalary()+"������"+m.getMoney());
		m.work();
		
	}


}


