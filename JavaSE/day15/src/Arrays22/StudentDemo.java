package Arrays22;

import java.util.ArrayList;
import java.util.Collection;

import Arrays.Student;

public class StudentDemo {
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

		Object[] objs = c.toArray();

		for (int x = 0; x < objs.length; x++) {
			Student s = (Student) objs[x];
			System.out.println("������" + s.getName() + "�����䣺" + s.getAge());

		}

	}
}
