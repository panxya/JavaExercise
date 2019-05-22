package Creat;

import java.io.File;
import java.io.IOException;

public class DeleteDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("d:\\aaa\\bb\\ccc\\ddd");
		boolean a = file.mkdirs();
		
		File file2 = new File("d:\\aaa\\bb\\ccc\\ddd\\a.txt");
		
		System.out.println(file2.createNewFile());
		

	}
}
