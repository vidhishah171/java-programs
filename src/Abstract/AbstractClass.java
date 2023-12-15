package Abstract;

public abstract class AbstractClass {
	String color;
	AbstractClass()
	{
		color="White";
	}
	abstract void draw();
	void fillColor()
	{	//Change
		System.out.println("Filling the shape with "+this.color);
	}
	final void show()
	{
		System.out.println(color+" Coloring done!");
	}
}
