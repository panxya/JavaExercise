package it.cast_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/*封装目的地与来源 不存在则创建  txt-java
 *  创立数组 获取来源文件名,过滤txt
 * 文件数组遍历
 * 复制
 * 在目的地处更名  Stringreplace Rename
 * 
 * */

public class FileRename {
	public static void main(String[] args) throws IOException {
	//封装目的地与来源 不存在则创建
		File desFile = new File("D:\\Text\\day21\\test2");
		File scrFile = new File("D:\\Text\\day21\\test");
		
		if(!desFile.exists()) {
			desFile.mkdir();
		}
	//	 获取来源文件名 创立数组	,过滤txt
		File[] FileName = scrFile.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isFile()&&name.endsWith(".txt");
			}
		});
		
		for(File file:FileName) {
			String name = file.getName();
			File newFile = new File(desFile,name);
			copyFile(file,newFile);
		}
		
		// 在目的地处更名  Stringreplace Rename
		File[] destNeme = desFile.listFiles();
		for(File destFile:destNeme) {
			String name = destFile.getName();
			String newName = name.replace(".txt", ".java");
			
			File newFile = new File(desFile,newName);
			destFile.renameTo(newFile);
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
}
