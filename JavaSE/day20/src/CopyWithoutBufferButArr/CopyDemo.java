package CopyWithoutBufferButArr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("c.txt");
		FileInputStream fis = new FileInputStream("d:\\Text\\b.txt");	
	
		
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys))!=-1) {
			fos.write(bys,0,len);
		}
	
	
	}
	
	
	



}
