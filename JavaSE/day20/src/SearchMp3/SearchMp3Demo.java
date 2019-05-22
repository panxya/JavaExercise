package SearchMp3;

import java.io.File;

public class SearchMp3Demo {
	public static void main(String[] args) {
		
		
		File scrFile = new File("D:\\mp3ת");
		
		Search(scrFile);
		
		
		
		
	}
	public static void Search(File scrFile) {
		
		File[] f = scrFile.listFiles();
		
		for(File file:f) {
			if(file.isDirectory()) {
				Search(file);
			}else {
				if(file.getName().endsWith(".mp3")) {
					System.out.println(file.getAbsolutePath());
				}
			}
		}	
	}



}
