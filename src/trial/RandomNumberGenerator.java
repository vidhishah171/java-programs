package trial;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		Random r = new Random();
		return r.nextInt();
	}

}
