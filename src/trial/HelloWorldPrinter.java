package trial;

public class HelloWorldPrinter implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello World from current thread.");
		System.out.println(ThreadExample.currentThread().getName());
	}

}
