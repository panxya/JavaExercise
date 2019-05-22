package cn.itcast_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class getAddress {
public static void main(String[] args) throws UnknownHostException {
	InetAddress ia = InetAddress.getByName("");
	String name = ia.getHostName();
	String ap = ia.getHostAddress();
	System.out.println(name + "---"+ap);
	
}
}
