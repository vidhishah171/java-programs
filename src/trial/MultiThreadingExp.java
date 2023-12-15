package trial;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadingExp {
	public  static void main(String args[]) throws InterruptedException, ExecutionException {
//		System.out.println("Hello");
//		System.out.println(Thread.currentThread().getName());
//		HelloWorldPrinter h = new HelloWorldPrinter();
//		
//		
//		Thread t = new Thread(h);
//		t.run();
//		h.run();
//		t.start();
//		ExecutorService s = Executors.newFixedThreadPool(10);
//		for(int i=1;i<=100;i++) {
//			NumberPrinter n = new NumberPrinter(i);
//			if(i==80) {
//				System.out.println();
//			}
//			s.execute(n);
//			Thread t = new Thread(n);
//			t.start();
//		}
		
		ExecutorService randomNum = Executors.newFixedThreadPool(2);
		RandomNumberGenerator r1 = new RandomNumberGenerator();
		RandomNumberGenerator r2 = new RandomNumberGenerator();
		Future<Integer> random1 = randomNum.submit(r1);
		Future<Integer> random2 = randomNum.submit(r1);
		System.out.println("Sum: " + (random1.get()+random2.get()));
	}
}