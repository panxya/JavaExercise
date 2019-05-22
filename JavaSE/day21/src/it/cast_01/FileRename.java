package it.cast_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/*��װĿ�ĵ�����Դ �������򴴽�  txt-java
 *  �������� ��ȡ��Դ�ļ���,����txt
 * �ļ��������
 * ����
 * ��Ŀ�ĵش�����  Stringreplace Rename
 * 
 * */

public class FileRename {
	public static void main(String[] args) throws IOException {
	//��װĿ�ĵ�����Դ �������򴴽�
		File desFile = new File("D:\\Text\\day21\\test2");
		File scrFile = new File("D:\\Text\\day21\\test");
		
		if(!desFile.exists()) {
			desFile.mkdir();
		}
	//	 ��ȡ��Դ�ļ��� ��������	,����txt
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
		
		// ��Ŀ�ĵش�����  Stringreplace Rename
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
