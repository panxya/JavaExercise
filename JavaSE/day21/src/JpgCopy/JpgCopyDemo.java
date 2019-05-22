package JpgCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JpgCopyDemo {
	public static void main(String[] args) throws IOException {
		File scrfile = new File("d:\\大学资料\\2.jpg");
		
		File desfile = new File("2.jpg");
		
		method(scrfile,desfile);
		
	}

	private static void method(File scrfile, File desfile) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(scrfile));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(desfile));
		
		byte[] bys = new byte[1024];
		int len =0;
		while((len = bis.read(bys))!=-1) {
			bos.write(bys,0,len);
		}
		bos.close();
		bis.close();
		
	}
	
}
