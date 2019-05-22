package Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		
		int by = 0;
		while((by = fis.read())!=-1) {
			System.out.print((char)by);
		}
		fis.close();
	}
}
