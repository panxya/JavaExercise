class Student {

	private String name;
	private int age;
	
	//��ȡ����ֵ

	public String getName() {
		return name;
	}
	//��������ֵ
	public void setName(String n) {
		name = n;
	}
	
	//��ȡֵ
	public int getAge() {
		return age;
	}
	//��ֵ
	public void setAge(int a) {
		age = a;
		
	}
}

class StudentDemo {
	public static void main(String[] args) {
		
		//����ѧ������
		Student d = new Student();
		//ʹ�ó�Ա����
		System.out.println(d.getName()+"---"+d.getAge());

		
		d.setName("��");
		d.setAge(88);
		System.out.println(d.getName()+"---"+d.getAge());
		
		}
			
	}

