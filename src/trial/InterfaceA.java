package trial;

public interface InterfaceA {
	
	
	int a=5;
	
	default void print() {
		System.out.println("Interface A");
	}
}
