package day17_SetTree;

import java.util.TreeSet;

public class SetTreeDemo {
	public static void main(String[] args) {
		TreeSet<Student> st = new TreeSet<Student>();
		
		Student s = new Student("We",11);
		Student s1 = new Student("We",11);
		Student s2 = new Student("have",12);
		Student s3 = new Student("Cat",13);
		Student s4 = new Student("Dog",14);
		 
		
		st.add(s);
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		
		for(Student ss : st) {
			System.out.println(ss.getName()+ss.getAge());
		}
	}
	
	
	
	
}
