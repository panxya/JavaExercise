package cn.itcast_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflect {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("cn.itcast_01.Person");
		
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		
		Method me = c.getMethod("show");
		Object ob = me.invoke(obj);
		
		Method me1 = c.getMethod("getString", String.class,int.class);
		Object ob1 = me1.invoke(obj, "ίχίχ",22);
		
		System.out.println(ob1);
	}
}
