package cn.itcast_07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serverDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(1000);
		//输入
		
		Socket s = ss.accept();
		InputStream is = s.getInputStream();
		
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String str = new String(bys,0,len);
		System.out.println("We receive "+str);
		//输出
		OutputStream os = s.getOutputStream();
		os.write("收到了".getBytes());
		
		s.close();
	}
}
