package annotationtest;
import java.lang.annotation.*;

@MyAnnotation1(value = 20)
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD})
public @interface MyAnnotation2 {
	//Multi-Value Annotation
	int val() default 5;
	String name() default "Vidhi";
	String[] names() default "Vidhi,Vrunda";
}