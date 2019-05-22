package CopyWithBufferArr;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("e.txt"));
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("d:\\Text\\b.txt"));
	
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = bis.read(bys))!=-1) {
			bos.write(bys,0,len);
		}
		bos.close();
		bis.close();
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
	
	
	
	}
	
}
