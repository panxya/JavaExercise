package cn.itcast_01;

import java.lang.reflect.Constructor;

public class ReflectDemo1 {
	public static void main(String[] args) throws Exception{
		Class c= Class.forName("cn.itcast_01.Person");
		Constructor[] con = c.getDeclaredConstructors();
		for(Constructor cc :con){
			System.out.println(cc);
		}
		
		Constructor con1 = c.getConstructor();
		Object obj = con1.newInstance();
		System.out.println(obj);
		
		
		Constructor con2 = c.getConstructor(String.class,int.class);
		Object obj2 = con2.newInstance("ÎÞÃû",22);
		System.out.println(obj2);
		
		Constructor con3 = c.getDeclaredConstructor();
		con3.setAccessible(true);
		Object obj3 = con3.newInstance();
		System.out.println(obj3);
		
	}
}
