package cn.itcast_09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException, IOException {
		Socket s= new Socket(InetAddress.getByName("pxy"),10000);
		
		BufferedInputStream bis =new BufferedInputStream(new FileInputStream("333.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = bis.read(bys))!=-1) {
			bos.write(bys,0,len);
			bos.flush();
		}
				
		s.shutdownOutput();
		
		InputStream is = s.getInputStream();
		byte[] bys1 = new byte[1024];
		int len2 = is.read(bys1);
		
		String client = new String(bys1,0,len2);
		System.out.println(client);
		
		bis.close();
		s.close();
		
		
		
		
	}
}
