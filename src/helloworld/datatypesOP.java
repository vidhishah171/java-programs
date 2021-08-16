package helloworld;

public class datatypesOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unary
		int x=5;
		System.out.println(x++); //5(6)
		System.out.println(++x); //7
		System.out.println(x--); //7(6)
		System.out.println(--x); //5
		System.out.println(~x);
		//arithmetic
		int a=10;
		System.out.println(a+a*a/a-30%a);
		System.out.println(a>>1);
		System.out.println(-a>>>1); //changes msb to 0, changes for negative
		System.out.println(x>=a);
		System.out.println();
		int b=5;  
		int c=20;  
		System.out.println(a<b&&a<c); //false && true = false  
		System.out.println(a<b&a<c); //false & true = false  
		// bitwise checks both conditions irrespective to first condition
		System.out.println(a<b&&a++<c);//false && true = false  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a<b&a++<c);//false && true = false  
		System.out.println(a);//11 because second condition is checked 
		
		System.out.println((a>b)?b:a);
		//adding short
		short d=10;
		short e=20;
		d=(short)(d+e);
		System.out.println(d);
	}

}
