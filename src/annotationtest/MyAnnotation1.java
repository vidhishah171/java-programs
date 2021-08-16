package annotationtest;
//import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
	//Single-Value Annotation
	int value();
}
