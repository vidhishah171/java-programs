package trial;

import java.util.ArrayList;
import java.util.List;

public class ClassC implements InterfaceA, InterfaceB {


@Override
public void print() {
	// TODO Auto-generated method stub
//	InterfaceA.super.print();
//	a=6;
	System.out.println(a);
	String x = "Vidhi";
	x.concat(" Shah");
	int a = 10;
	int b = 20;
	System.out.println(a++ + ++b);
	System.out.println(x);
}


public static void main(String[] args) {
	ClassC c = new ClassC();
	c.print();
	Integer first = 123;
	Integer second = 456;
	first = second;
	first = 789;
	System.out.println(second + " " + first);
	
	List<Integer> f = new ArrayList<>();
	List<Integer> s = new ArrayList<>();
	f = s;
	for(int i=0;i<5;i++) {
		f.add(i);
	}
	System.out.println(s);
}
}
