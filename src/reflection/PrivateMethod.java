package reflection;
import java.lang.reflect.*;

public class PrivateMethod {
	
	public static void main(String args[]) {
		try {
			Class<?> c=Class.forName("innerclass.Outer");
			Object obj=c.newInstance();
			Method method=c.getDeclaredMethod("changeAccess",null);
			method.setAccessible(true);
			method.invoke(obj,null);
			System.out.println();
			method=c.getDeclaredMethod("changeAccessPara", new Class[] {int.class,int.class});
			method.setAccessible(true);
			method.invoke(obj, 10,20);
		} catch(Exception e) {
			System.out.println(System.err);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
