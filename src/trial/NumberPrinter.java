package trial;

public class NumberPrinter implements Runnable {

	private int number;
	
	public NumberPrinter(int number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Number: " + this.number + " || " +ThreadExample.currentThread().getName());
//		System.out.println(Thread.currentThread().getName());
	}

}
