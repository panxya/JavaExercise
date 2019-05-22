package Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDeo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("d:\\Text\\b.txt");
		FileOutputStream fos = new FileOutputStream("ÃûÀû³¡.txt");
		
		int len = 0 ;
		byte[] bys = new byte[1024];
		while((len = fis.read(bys))!= -1) {
			fos.write(bys,0,len);
			System.out.print(new String(bys,0,len));
		}
		
		fis.close();
		fos.close();
	}
}
