package it.cast_05;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		MyBufferedReader mbr = new MyBufferedReader(new FileReader("5.txt"));
		
		String line = null;
		while((line = mbr.readLine())!=null) {
			System.out.println(line);
		}
	
	mbr.close();
	}
}
