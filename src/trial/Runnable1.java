package trial;

public class Runnable1 implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Thread count: "+ i);
		}
		// TODO Auto-generated method stub

	}

}
