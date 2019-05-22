package cn.itcast_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException, IOException {
		Socket s = new Socket(InetAddress.getByName("pxy"),10086);
		
		//Êä³öµ½+¼üÅÌÂ¼Èë
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		while((line=br.readLine())!=null) {
			if("886".equals(null)) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
			
			
		}
		
		s.close();
		
		
		
	}
}
