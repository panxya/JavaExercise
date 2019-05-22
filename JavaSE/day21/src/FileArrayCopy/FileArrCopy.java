package FileArrayCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileArrCopy {
	public static void main(String[] args) throws IOException{
		File scrFile = new File("d:\\Text\\demo");
		File desFile = new File("D:\\Text\\day21\\test");
		
		if(!desFile.exists()) {
			desFile.mkdir();
		}
		
		File[] fileArr = scrFile.listFiles();
		
		for(File file :fileArr) {
			String name = file.getName();
			File newFile = new File(desFile,name);
			copyFile(file,newFile);
		}
				
		
		
	}

	private static void copyFile(File file, File newFile) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(newFile));
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = bis.read(bys))!=-1) {
			bos.write(bys,0,len);
		}
		bos.close();
		bis.close();
		
	
	}
	
//	private static void copyFile(File file, File newFile) throws IOException {
//		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
//				file));
//		BufferedOutputStream bos = new BufferedOutputStream(
//				new FileOutputStream(newFile));
//
//		byte[] bys = new byte[1024];
//		int len = 0;
//		while ((len = bis.read(bys)) != -1) {
//			bos.write(bys, 0, len);
//		}
//
//		bos.close();
//		bis.close();
//	}
//	
//	
//	
	
	
	
	
	
}
