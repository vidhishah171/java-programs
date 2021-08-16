package Abstract;

public abstract class ChildClass extends AbstractClass implements ParentInterface {
	public abstract void draw();
	void fillColor() 
	{
		super.fillColor();
		color="Blue";
		System.out.println("Filling the shape with "+color+" color!");
	}
	void show1()
	{
		super.show();
		System.out.println("Drawing done!");
	}
	public void a()
	{
		System.out.println("Method A");
	}
	public static void main(String args[])
	{
		/*ChildClass a=new ChildClass();
		//AbstractClass a=new ChildClass();
		a.draw();
		a.fillColor();
		a.show();
		a.show1(); */
		System.out.println("Child class 1");
	}
}