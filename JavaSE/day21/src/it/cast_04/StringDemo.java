package it.cast_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) throws IOException {
		//读取文件存入字符串中
		BufferedReader br = new BufferedReader(new FileReader("3.txt"));
		String line = br.readLine();
		br.close();
		
		//to char
		char[] chs = line.toCharArray();
		
		//sort
		Arrays.sort(chs);
		
		//数组进入字串
		String s = new String(chs);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("5.txt"));
		bw.write(s);
		bw.newLine();
		bw.flush();
		bw.close();
		
		
		
		
		
		
		
	}
}
