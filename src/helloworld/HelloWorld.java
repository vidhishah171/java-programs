package helloworld;

public class HelloWorld {
	int n=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		int n=20;
		float f=n; //widening(implicit)
		System.out.println(n);
		System.out.println(f);
		float f1=10.5f;
		int a=(int)f1; //narrowing(explicit)
		System.out.println(a+" "+f1);
		int a1=130;
		byte b=(byte)a1; //overflow
		System.out.println(a1+" "+b);
		byte a2=10;
		byte c=(byte)(a2+b); //adding lower types (compile time error: a2 + b will be int)
		System.out.println(c);
		//System.out.println(j==k);
		long x=54L;
		double x1=x; //opposite not possible
		System.out.println(x1);
		int v=1;
		switch(v) {
		case 2: 
			System.out.println("In 2");
			break;
		case 1:
			System.out.println("In 1");
		case 3: 
			System.out.println("In 3");
		}
		
	}

}