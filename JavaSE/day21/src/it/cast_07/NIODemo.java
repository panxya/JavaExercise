package it.cast_07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class NIODemo {
	public static void main(String[] args) throws IOException, IOException {
	
		Files.copy(Paths.get("user.txt")
				,new FileOutputStream("9.txt"));
		ArrayList<String> array = new ArrayList<String>();
		array.add("www");
		array.add("world");
		array.add("java");
		
		Files.write(Paths.get("8.txt"), array, Charset.forName("GBK"));
		
		
	}
}
