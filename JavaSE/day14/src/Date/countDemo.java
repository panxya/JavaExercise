package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class countDemo {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������� ��2018-10-11");
		String st = sc.nextLine();
		
		
		//�õ�����
		SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd");
		Date d2 = adf.parse(st);
		long birth = d2.getTime();
		
		Date d = new Date();
		long now = d.getTime();
	
		long s = now - birth;
		long live = s/1000/60/60/24;
		System.out.println("You have lived "+live+"days.");
		
	}
}
