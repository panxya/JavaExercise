package cn.itcast_04;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DialogDemo {
	public static void main(String[] args) throws IOException {

		DatagramSocket ss = new DatagramSocket();
		DatagramSocket rs = new DatagramSocket(10086);

		ReceiveThread rd = new ReceiveThread(rs);
		SendThread sd = new SendThread(ss);

		Thread t1 = new Thread(rd);
		Thread t2 = new Thread(sd);

		t1.start();
		t2.start();
	}
}
