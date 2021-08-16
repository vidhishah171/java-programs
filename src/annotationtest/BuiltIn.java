package annotationtest;
//import java.lang.annotation.Annotation;
//import java.lang.annotation.*;
import java.lang.reflect.Method; 

@MyAnnotation
interface a{}

@Subclass
@MyAnnotation
class Base{
	void hello() {
		System.out.println("Hello");
	}
}

@MyAnnotation
public class BuiltIn extends Base {
	@MyAnnotation2(val=1, names= {"Vidhi,Vidhi1"})
	int variable=50;
	
	@MyAnnotation2(names= {"Vidhi2,Vidhi3"})
	BuiltIn(@MyAnnotation String s){
		System.out.println("Constructor: "+s);
	}
	
	@Deprecated
	@MyAnnotation1(value = 30)
	void deprecatedMethod() {
		System.out.println("Deprecated method!");
	}
	
	@Override
	public void hello() {
		System.out.println("Hello, how are you?");
	}
	
	//@SuppressWarnings()
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		@MyAnnotation1(value = 30)
		int var1=5;
		System.out.println(var1);
		BuiltIn builtIn=new BuiltIn("Hey there!");
		builtIn.deprecatedMethod();   
		Method m=builtIn.getClass().getDeclaredMethod("deprecatedMethod");
		System.out.println(m);
//		Annotation[] ann=m.getDeclaredAnnotations();
//		for(Annotation a:ann) {
//			System.out.println(a);
//		}
//			MyAnnotation1 self=(MyAnnotation1)a;
//			System.out.println(self.value());
//		}
		MyAnnotation1 manno=m.getAnnotation(MyAnnotation1.class);  
		System.out.println("value is: "+manno.value());  
		System.out.println();
		for(Method gm:BuiltIn.class.getMethods())
			System.out.println(gm.getName());
		System.out.println();
		for(Method gd:BuiltIn.class.getDeclaredMethods())
			System.out.println(gd.getName());
	}

}
