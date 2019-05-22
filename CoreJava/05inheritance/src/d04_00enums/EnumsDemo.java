package d04_00enums;

import java.util.Scanner;

public class EnumsDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a size:SMALL,MEDIA,LARGE,EXTRA_LARGE");
		String input = in.next().toUpperCase();
		
		Size size = Enum.valueOf(Size.class, input);
		System.out.println(size);
		System.out.println(size.getAbbreviation());
		if(size == Size.EXTRA_LARGE) {
			System.out.println("What a pation man.");
		}
	}
}
