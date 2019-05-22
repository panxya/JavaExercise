package d05_03methods;

import java.lang.reflect.Method;

/**
 * this program shows how 2 invoke methods through reflection
 * @author ะกั๎
 * @version V1.0
 */
public class MethodTest {
		public static void main(String[] args) throws Exception {
			Employee e = new Employee("Jacky",80000,1990,11,21);
			Class c = e.getClass();
			Method m = c.getMethod("raiseSalary", double.class);
			m.invoke(e, 2.0);
		
		}
		
}
