/*

�ࣺԱ��
��Ա������ Ա�����  ����  ����
��Ա������ get set show 
���췽�����޲�

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
		System.out.println("Ա�����Ϊ��"+ID+"�����ǣ�"+name+"����Ϊ��"+age);
	
	}
	
}


class EmployeeTest{
	public static void main(String[] args) {
	//��������
		Employee e = new Employee();
		
	//��ֵ
		e.setID("123455");
		e.setName("��");
		e.setAge(22);
		e.show();
		
		
	
	
	}


}
