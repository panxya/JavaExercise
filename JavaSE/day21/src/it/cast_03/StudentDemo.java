package it.cast_03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentDemo {
	public static void main(String[] args) throws IOException {
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				int num = s2.getSum()-s1.getSum();
				int num2 = num == 0?s1.getChinese()-s2.getChinese():num;
				int num3 = num2 == 0?s1.getMath()-s2.getMath():num2;
				int num4 = num3 == 0?s1.getEnglish()-s2.getEnglish():num3;
				int num5 = num4 == 0?s1.getName().compareTo(s2.getName()):num4;
				
				return num5;
			}
		});
	
		//把学生信息存到集合中
		for(int x = 1;x<=5;x++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the"+x+"Student.");
		System.out.println("name");
		String name = sc.nextLine();
		System.out.println("Chinese");
		int chinese = sc.nextInt();
		System.out.println("Math");
		int math = sc.nextInt();
		System.out.println("English");
		int english = sc.nextInt();
		
		Student s = new Student();
		s.setName(name);
		s.setChinese(chinese);
		s.setMath(math);
		s.setEnglish(english);
		 ts.add(s);
	}
	
		//数据写入文本中	
	
		BufferedWriter bw = new BufferedWriter(new FileWriter("StudentGrade.txt"));
		bw.write("Here is the information of Student.");
		bw.newLine();
		bw.flush();
		bw.write("name,Chinese,Math,English");
		bw.newLine();
		bw.flush();
		for(Student s :ts) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.getName()).append(",").append(s.getChinese()).append(",")
			.append(s.getMath()).append(",").append(s.getEnglish());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
		System.out.println("Over.");
		
	}
}
