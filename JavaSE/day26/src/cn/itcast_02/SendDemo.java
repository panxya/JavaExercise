package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		// �������Ͷ�socket����
		DatagramSocket ds = new DatagramSocket();
		// ��������
		byte[] bys = "sss�γ�".getBytes();
		int lentth = bys.length;
		InetAddress ia = InetAddress.getByName("pxy");
		int port = 10086;
		// ����
		DatagramPacket dp = new DatagramPacket(bys, lentth, ia, port);
		ds.send(dp);
		ds.close();
	}
}
