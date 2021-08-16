package annotationtest;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.PARAMETER})
public @interface MyAnnotation {
	//marker annotation - @Override and @Deprecated
}
