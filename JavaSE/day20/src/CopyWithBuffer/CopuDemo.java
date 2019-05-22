package CopyWithBuffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopuDemo {
	public static void main(String[] args) throws IOException {
		
		long start = System.currentTimeMillis();
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("d.txt"));
		BufferedInputStream bis	= new BufferedInputStream(
				new FileInputStream("d:\\Text\\b.txt"));
		
		int by = 0;
		while((by = bis.read())!= -1) {
			bos.write(by);
			System.out.print((char)by);
		}
		
		bos.close();
		bis.close();
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
	}
}
