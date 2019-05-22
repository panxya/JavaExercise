package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// ���ն˿�
		DatagramSocket ds = new DatagramSocket(10086);
		// ���հ�
		byte[] bys = new byte[1024];
		int length = bys.length;
		DatagramPacket dp = new DatagramPacket(bys, length);
		// ����
		ds.receive(dp);

		// ����
		byte[] bys2 = dp.getData();
		int len = bys.length;

		InetAddress ia = dp.getAddress();
		String ip = ia.getHostAddress();

		String s = new String(bys2, 0, len);
		System.out.println(ip + ":" + s);
		ds.close();

	}
}
