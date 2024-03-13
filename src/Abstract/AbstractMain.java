package Abstract;

public class AbstractMain extends AbstractClass1{

	public AbstractMain() {
		System.out.println("Subclass default constructor.");
	}
	
	public AbstractMain(int x) {
		super();  //Constructor call must be the first statement in a constructor
//		this();  //Constructor call must be the first statement in a constructor
		int a = 0520;
		System.out.println(a);
		System.out.println("Subclass default constructor with arg: " + x + ".");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMain a = new AbstractMain(5);
		a.printHello();
	}
	
	public static void main(Integer[] args) {
		// TODO Auto-generated method stub
		AbstractMain a = new AbstractMain();
		a.printHello();
	}

}

abstract interface X {}

 class AbstractMain1 extends AbstractClass1{

	public AbstractMain1() {
		System.out.println("Subclass default constructor.");
	}
	
	public AbstractMain1(int x) {
		super();  //Constructor call must be the first statement in a constructor
//		this();  //Constructor call must be the first statement in a constructor
		System.out.println("Subclass default constructor with arg: " + x + ".");
	}
	
	public void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMain a = new AbstractMain();
		a.printHello();
	}
	
	public static void main(Integer[] args) {
		// TODO Auto-generated method stub
		AbstractMain a = new AbstractMain();
		a.printHello();
	}

}
