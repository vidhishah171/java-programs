package keywords;

public final class Child1 extends Parent{
	String color="black";
	int z;
	static final int data;
	static
	{
		data=50;
	}
	Child1(int x,int y,int z)
	{
		super(x,y);
		//this.x=x;
		//this.y=z;
		this.z=z;
		System.out.println("Assigning variable x to: "+x+" and y="+y+" and z="+this.z);
	}
	final void printColor()
	{
		System.out.println("Child1: "+color+" And variable x="+x+"Static variable data="+data);
		super.printColor();
		System.out.println("Parent color: "+super.color+" and Child1 color: "+color);
	}
	public static void main(String args[])
	{
		Child1 c2=new Child1(1,2,3);
		c2.print();
		c2.finalPara(3);
		
	}
}
