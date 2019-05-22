package for3;

import java.util.ArrayList;
import java.util.Iterator;

public class for3 {
	public static void main(String[] args) {
		ArrayList<Student> arr =new ArrayList<Student>();
		Student s = new Student("a",11);
		Student s1 = new Student("a",11);
		Student s2 = new Student("a",11);
		Student s3 = new Student("a",11);
		Student s4 = new Student("a",12);
		
		arr.add(s);
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		
		for(int x = 0;x<arr.size();x++) {
			Student sss =arr.get(x);
			System.out.println(sss.getName()+"--"+sss.getAge());
		}
		
		Iterator<Student> it = arr.iterator();
		while(it.hasNext()) {
			Student ss = it.next();
			System.out.println(ss.getName()+"--"+ss.getAge());
		}
		
		for(Student ssss :arr) {
			System.out.println(ssss.getName()+"--"+ssss.getAge());
		}
		
		
	}
}
