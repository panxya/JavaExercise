package CopyWithoutBuffer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
	public static void main(String[] args) throws IOException {
		
		long start = System.currentTimeMillis();
		FileOutputStream fos = new FileOutputStream("b.txt");
		FileInputStream fis = new FileInputStream("d:\\Text\\b.txt");
		
		int by = 0;
		while((by = fis.read())!=-1) {
			fos.write(by);
			System.out.print((char)by);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}
}
