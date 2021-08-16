package Abstract;

public interface ChildInterface extends ParentInterface {
	default void draw()
	{
		System.out.println("Method of Parent Interface implemented by child and x="+x);
	}
	void d();
}
