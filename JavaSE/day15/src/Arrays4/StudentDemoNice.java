package Arrays4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Arrays.Student;

public class StudentDemoNice {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Student s1 = new Student("����", 12);
		Student s2 = new Student("����", 12);
		Student s3 = new Student("�ٺ�", 12);
		Student s4 = new Student("����", 12);
		Student s5 = new Student("����", 12);

		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		Iterator it = c.iterator();
		while(it.hasNext()) {
			Student s = (Student)it.next();
			System.out.println("������" + s.getName() + "�����䣺" + s.getAge());
		}
		
	}
}
