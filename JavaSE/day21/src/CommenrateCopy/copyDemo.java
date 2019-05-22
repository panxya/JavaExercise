package CommenrateCopy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyDemo {
	public static void main(String[] args) throws IOException {
		
		long start = System.currentTimeMillis();		
		BufferedReader br = new BufferedReader(
				new FileReader("d:\\book\\中英对照\\《名利场.txt"));
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("a.txt"));
		
		method(br,bw);
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
	}
	
	
	private static void method(BufferedReader br, BufferedWriter bw) throws IOException {
		// TODO Auto-generated method stub
		String line = null;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
	br.close();
	bw.close();
	
	
	}

}
