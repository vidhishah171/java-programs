package trial;

public class ThreadExample {

	public ThreadExample(int a) {
		System.out.println("a");
	}
	
	public static void main(int[] args) {
		
	}
	
	public static void main(String args[]) {
		ThreadExample.main(new String[] {"a","b"});
		System.out.println("Begin");
		new Thread(new Thread1()).start();
		new Thread(new Runnable1()).start();
		new Thread(new Runnable1()).start();
		System.out.println("End"); 
	}
}


//class Mammal extends ThreadExample {
//
//	public static void main(String[] args) {
//		Mammal m = new Mammal();
//	}
//}


//class C {
//	public static void main(String[] args) {
//		ThreadExample ex = new ThreadExample(0);
//		ThreadExample.main(new int[]{1, 2});
//	}
//}
