package javacollections;

public class LambdaFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=20;
		LambdaTrial lTrial1=new LambdaTrial() {
			public void draw() {System.out.println("Drawing "+number+" lines using anonymous class.");}
		};
		lTrial1.draw();
		LambdaTrial lTrial = () -> {System.out.println("Drawing "+number+" lines.");};
		lTrial.draw();
//		Paintings paintVar= no -> ("Painting "+no+" paintings.");
		Paintings paintVar= no -> "Painting "+no+" paintings.";
		System.out.println(paintVar.paint(25));
		Countable countVar = (a,b) -> (a*b);
		System.out.println("Counting a*b="+countVar.count(6, 5));
		
	}

}
