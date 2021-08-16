package Abstract;

public class ImplementingClass implements ChildInterface, ParentInterface{

	public void a()
	{
		System.out.println("Method A");
	}
	public void b()
	{
		System.out.println("Method B");
	}
	public void d()
	{
		System.out.println("Method D and x="+x);
	}
	public void draw()
	{
		System.out.println("Method draw");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementingClass i=new ImplementingClass();
		i.a();
		i.b();
		i.d();
		i.draw();
		ParentInterface.cube(9);
		System.out.println(ParentInterface.x);
	}

}
