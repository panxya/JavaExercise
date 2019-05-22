package hasCode1;

import java.util.HashSet;

public class hasCodeDemo {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		
		Student s = new Student("林林",1);
		Student s1 = new Student("林林",1);
		Student s2 = new Student("琳琳",12);
		Student s3 = new Student("淋淋",13);
		Student s4 = new Student("林立",14);
		
		hs.add(s);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		for(Student sss :hs) {
			System.out.println(sss.getName()+sss.getAge());
		}
	}
	
	
}
