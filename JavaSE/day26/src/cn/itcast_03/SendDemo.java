package cn.itcast_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket da = new DatagramSocket();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line=br.readLine())!=null) {
			if("886".equals(line)) {
				break;
			}
			//°ü
			byte[] bys = line.getBytes();
			DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("pxy"), 10086);
			//·¢
			da.send(dp);
			
		}
		
		da.close();
		
	}
}
