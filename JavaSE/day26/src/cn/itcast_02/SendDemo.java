package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		// 创建发送端socket对象
		DatagramSocket ds = new DatagramSocket();
		// 参数设置
		byte[] bys = "sss课程".getBytes();
		int lentth = bys.length;
		InetAddress ia = InetAddress.getByName("pxy");
		int port = 10086;
		// 建包
		DatagramPacket dp = new DatagramPacket(bys, lentth, ia, port);
		ds.send(dp);
		ds.close();
	}
}
