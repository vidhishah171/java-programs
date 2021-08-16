package helloworld;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		int a[]= {14,22,43,42,55,16};
		
		for(int i:a) //for-each
		{
			System.out.print(i+" ");
		}
		int i=1;
		aa:
			while(i<4)
			{
				int j=1;
				bb:	
					do{
						if(i==2 && j==2)
						{
							break aa;
							//break bb;
						}
						if(i==2 && j==1)
						{
							break bb;
						}
						System.out.println(i+" "+j);
						j++;
					}while(j<4);
				i++;
			}
		/*for(;;)
		{
			System.out.println("Infinitive loop");
		}*/
	}

}
