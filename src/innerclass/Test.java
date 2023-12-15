package innerclass;

public class Test
{
   public static void main(String[] args)
   {
	   //  Enum declaration can be done outside a Class or inside a Class but not inside a Method.
//	   enum E {
//		   Red,Blue,Green;
//	   }
       MyEnums[] myEnums = new MyEnums[4];
       String[] s = new String[3];
       int[] s1 = new int[3];
       for (int i = 0; i < myEnums.length; i++)
       {
           System.out.println(myEnums[i]);
       }
   }
}