package it.cast_02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFoldersDemo {
	public static void main(String[] args) throws IOException{
		File scrFile = new File("test");
		File destFile = new File("test2");
		copyFolder(scrFile,destFile);	
	}
//复制文件夹
	private static void copyFolder(File scrFile, File destFile) throws IOException{
		// TODO Auto-generated method stub
		if(scrFile.isDirectory()) {
			//文件夹创建
			File newFolder = new File(destFile,scrFile.getName());
			newFolder.mkdir();
			
			//获取
			File[] fileArray = scrFile.listFiles();
			for(File file:fileArray) {
				copyFolder(file,newFolder);
			}
			
		}else {
			File newFile = new File(destFile,scrFile.getName());
			sopyFile(scrFile,newFile);
		}
		
	}

	private static void sopyFile(File scrFile, File newFile) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(scrFile));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(newFile));
		byte[] bys = new byte[1024];
		int len = 0 ;
		while((len = bis.read(bys))!=-1) {
			bos.write(bys,0,len);
		}
		bos.close();
		bis.close();
		
	}
	
	
	
}
