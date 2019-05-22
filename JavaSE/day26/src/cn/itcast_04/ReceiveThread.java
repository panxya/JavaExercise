package cn.itcast_04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {

	private DatagramSocket ds;

	

	public ReceiveThread(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			while (true) {
				// 建立包
				byte[] bys = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bys, bys.length);
				// 接收

				ds.receive(dp);

				// 解析
				String name = dp.getAddress().getHostAddress();
				String s = new String(dp.getData(), 0, dp.getLength());

				System.out.println("from" + name + "is" + s);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
