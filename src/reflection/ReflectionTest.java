package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
//import keywords.Parent;

//import keywords.Parent;

class Parent1 {
	void msg() {
		System.out.println("Parent1 msg method");
	}	
}

interface int1{}

public class ReflectionTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		// TODO Auto-generated method stub
//		System.out.println(Thread.currentThread().getContextClassLoader().loadClass("Parent2"));
		
		Parent1 parent=new Parent1();
		parent.msg();
		Class class1=parent.getClass();
		System.out.println(class1.getName());
		System.out.println();
		
		Class class2=Parent2.class;
		System.out.println(class2.getName());
		for(Method m:class2.getDeclaredMethods()) {
			System.out.println(m);
		}
		System.out.println();
		keywords.Parent p1=new keywords.Parent(5,7);
		Class parentInstance=Class.forName("keywords.Parent");
		System.out.println("Is it interface? "+parentInstance.isInterface());
		System.out.println("Is it ArrayClass? "+parentInstance.isArray());
		System.out.println("Is it primitive type? "+parentInstance.isPrimitive());
		System.out.println("Is instance? "+parentInstance.isInstance(p1));
		
		for(Annotation s:parentInstance.getDeclaredAnnotations()) {
			System.out.println("Hey"+s);
		}
		System.out.println("Class: "+parentInstance.getName()+"\nPackage: "+parentInstance.getPackageName()+"\n ");
		for(Field m:parentInstance.getDeclaredFields()) {
			System.out.println(m);
		}
		for(Method m1:parentInstance.getDeclaredMethods()) {
			System.out.println(m1);
		}
		
		Class parent1=Class.forName("reflection.Parent1");
		@SuppressWarnings("deprecation")
		reflection.Parent1 kp=(reflection.Parent1)parent1.newInstance();
		kp.msg();
		System.out.println();
		
		Class c1=Class.forName("reflection.int1");
		System.out.println("Is it interface? "+c1.isInterface());
		System.out.println(c1.getName()+" "+c1.getPackageName());
		
	}

}
