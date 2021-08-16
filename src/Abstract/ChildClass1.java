package Abstract;

public class ChildClass1 extends ChildClass {
	public void draw()
	{
		System.out.println("Drawing Shape of "+color+" color!");
	}
	public void b()
	{
		System.out.println("Method B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass1 a=new ChildClass1();
		ParentInterface a1=new ChildClass1();
		a.draw();
		a.fillColor();
		a.show();
		a.show1();
		a.a();
		System.out.println(a1.getClass());
		a1.a();
		a1.b();
	}

}
