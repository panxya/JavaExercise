package filesearch;

import java.io.File;

public class FileSearchDemo {
	public static void main(String[] args) {
		File file = new File("D:\\");
		
		File[] ff = file.listFiles();
		
		for(File f :ff) {
			if(f.isFile()) {
				if(f.getName().endsWith(".jpg")) {
					System.out.println(f.getName());
				}
			}
		}
		
		
		
	}
}
