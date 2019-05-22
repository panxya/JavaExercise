package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds =new DatagramSocket(10086);
		while(true) {
			//������
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);
			//����
			ds.receive(dp);
			//����
			String name = dp.getAddress().getHostAddress();
			String s = new String(dp.getData(),0,dp.getLength());
			
			System.out.println("from"+name +"is"+s);
		}
		
		
		
		
	}
}
