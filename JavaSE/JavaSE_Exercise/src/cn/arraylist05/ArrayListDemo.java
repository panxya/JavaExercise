package cn.arraylist05;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		Student s1 = new Student("����",2);
		Student s2 = new Student("����",3);
		Student s3 = new Student("����",4);
		Student s4 = new Student("����",5);
		Student s5 = new Student("����",6);
		
		
		
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		arr.add(s5);
		
		
		Iterator it = arr.iterator();
		while(it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName()+"___"+s.getAge());
		}
		
	}
}
