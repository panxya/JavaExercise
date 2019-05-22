package cn.itcast_05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException, IOException {
		Socket s = new Socket(InetAddress.getByName("pxy"), 10000);
		//Ð´³ö
		OutputStream os = s.getOutputStream();
		os.write("aaa".getBytes());
		s.close();

	}
}
