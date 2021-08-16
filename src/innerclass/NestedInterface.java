package innerclass;

public class NestedInterface implements OuterInterface.Nested,Outer.NestedInterface1{
	public void show() {
		System.out.println("Nested interface method");
	}
	public void showmsg() {
		System.out.println("Interface in class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterInterface.Nested nested=new NestedInterface();
		nested.show();
		Outer.NestedInterface1 classInterface=new NestedInterface();
		classInterface.showmsg();
	}

}
