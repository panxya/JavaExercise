package Arrays;

public class studentDemo {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		
		Student s1 = new Student("小林",22);
		Student s2 = new Student("小青",22);
		Student s3 = new Student("小霞",22);
		Student s4 = new Student("祖儿",22);
		Student s5 = new Student("hooc",22);
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		
		
		
		for(int x= 0;x<students.length;x++) {
			Student s = students[x];
			System.out.println("姓名："+s.getName()+"，年龄："+s.getAge());
			
		}
	}
}
