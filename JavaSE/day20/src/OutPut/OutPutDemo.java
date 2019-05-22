package OutPut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("a.txt");
		
		fos.write("abccccccccccc,cccccc\r\nfjvhbghff".getBytes());
		
		
	}
}
