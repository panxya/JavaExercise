package cn.itcast_09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10000);
		Socket s = ss.accept();
		BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("222.jpg"));
		byte[] bys = new byte[1024];
		int line = 0;
		while((line = bis.read(bys))!=-1) {
			bos.write(bys,0,line);
			bos.flush();
		}
		OutputStream os = s.getOutputStream();
		os.write("Í¼Æ¬¸´ÖÆÍê±Ï".getBytes());
		bos.close();
		s.close();
	
	}
}
