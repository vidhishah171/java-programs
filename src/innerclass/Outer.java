package innerclass;

public class Outer {
	private int data=50;
	@SuppressWarnings("unused")
	private void changeAccess() {
		System.out.println("Access Changed!");
		MemberInner inner = new MemberInner();
		System.out.println(inner.a);
	}
	
	@SuppressWarnings("unused")
	private void changeAccessPara(int a,int b) {
		System.out.printf("value1=%d, value2=%d",a,b);
	}
	static int data1=100;
	class MemberInner{
		private int a=100;
		//outside any method
		void msg() {
			System.out.println("Data is: "+data);
		}
	}
	
	void display()
	{
		final int data=60;
		int datax = 10;
		System.out.println("Method of outer class.");
		this.changeAccess();
		class LocalInner{
			//couldn't access non-final variable of outer class method before jdk  1.7
			void show()
			{
				new Outer().changeAccess();
				System.out.println("Local Inner class method. Data: "+data);
				System.out.println("Local Inner class method. Datax: "+datax);
			}
		}
		LocalInner localIn=new LocalInner();
		localIn.show();
	}
	
	static class staticInner{
		static void staticDisplay(){
			System.out.println("Static method of static class. data: "+data1);
		}
		void nonStaticDisplay() {
			System.out.println("Non static method of static class. data: "+data1);
		}
	}
	
	 interface NestedInterface1{
		void showmsg();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.MemberInner memberIn=new Outer().new MemberInner();
		memberIn.msg();
		
		Outer outer=new Outer();
		outer.display();
		
		Outer.staticInner staticIn=new Outer.staticInner();
		staticIn.nonStaticDisplay();
		Outer.staticInner.staticDisplay();
		Outer.NestedInterface1 classInterface=new NestedInterface();
		classInterface.showmsg();
	}

}
