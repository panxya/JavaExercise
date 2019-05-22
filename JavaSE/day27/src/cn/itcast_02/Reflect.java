package cn.itcast_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;




public class Reflect {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.itcast_01.Person");
		
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		Field[] fields = c.getDeclaredFields();
		
		for(Field f : fields) {
			f.setAccessible(true);
			System.out.println(f);
		}
		
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "ажаж");
		System.out.println(obj);
		
		Field ageField =c.getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.set(obj, 22);
		System.out.println(obj);
		
		
		
	}
}
