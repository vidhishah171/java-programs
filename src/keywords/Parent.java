package keywords;

//@SuppressWarnings(value = { "deprecation" })
public class Parent {
	String color="white";
	final int y;
	int x;
	public Parent(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("Parent: Assigning variable x to: "+this.x+" and y="+y);
	}
	@Deprecated
	void printColor()
	{
		System.out.println("Parent: "+color+" And variable x="+x);
	}
	final void print()
	{
		System.out.println("Final method in parent class");
	}
	void finalPara(final int n)
	{
		int p=n+2;
		System.out.println(p);
	}
}
