package cn.itcast_07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class clientDemo {
	public static void main(String[] args) throws IOException, IOException {
		Socket s = new Socket(InetAddress.getByName("pxy"),1000);
		//д
		OutputStream os = s.getOutputStream();
		os.write("������������".getBytes());
		//��ȡ
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len =is.read(bys);
		String str = new String(bys,0,len);
		System.out.println(str);
		s.close();
	}
}
