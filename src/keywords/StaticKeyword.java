package keywords;

public class StaticKeyword {
	static int count;
	int run=0;
	static
	{
		System.out.println("Static block invoked!"); 
		count=10;
	}
	void run()
	{
		run+=10;
		System.out.println(run);
	}
	static void count()
	{
		System.out.println(++count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword s=new StaticKeyword();
		StaticKeyword s1=new StaticKeyword();
		s.run();
		s1.run();
		s.run();
		System.out.println("Count: ");
		StaticKeyword.count();
		StaticKeyword.count();
		StaticKeyword.count();
		System.out.println("Count: "+StaticKeyword.count);
	}

}
