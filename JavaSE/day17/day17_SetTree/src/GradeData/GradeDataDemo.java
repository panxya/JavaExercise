package GradeData;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class GradeDataDemo {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			
			public int compare(Student s1,Student s2) {
				int num = s2.sum()-s1.sum();
				int num1 = num == 0? s1.getChinese()-s2.getChinese():num;
				int num2 = num1 == 0?s1.getMath()-s2.getMath():num1;		
				int num3 = num2 == 0? s1.getEnglish()-s2.getEnglish():num2;
				int num4 = num3 == 0? s1.getName().compareTo(s2.getName()):num3;
				
				return num4;
			}
		});
		
		//录入，封装，添加，遍历
		for(int x = 0;x<3;x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name.");
			String a = sc.nextLine();
			System.out.println("Enter your Chinese grade.");
			String b = sc.nextLine();
			System.out.println("Enter your Math grade.");
			String c = sc.nextLine();
			System.out.println("Enter your English grade.");
			String d = sc.nextLine();
			
			Student ss = new Student();
			ss.setName(a);
			ss.setChinese(Integer.parseInt(b));
			ss.setMath(Integer.parseInt(c));
			ss.setEnglish(Integer.parseInt(d));
			
			ts.add(ss);		
		}
		
		System.out.println("Enter is end.");
		System.out.println("name\tChinese\tMath\tEnglish");
		
		for (Student sss :ts) {
			System.out.println(sss.getName()+"\t"+sss.getChinese()+"\t"+sss.getMath()+"\t"+sss.getEnglish());
		}
	}
}
