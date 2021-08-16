package stringmethods;
import java.util.regex.*;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String obj1="trying java string split method"; 
		//String s1=new String("hii");
		String[] words=obj1.split("\\s",4); 
		for(String w:words)
		{  
			System.out.println(w);  
		}
		String[] splitByChar=obj1.split("s", 0);
		System.out.println("Array length: "+words.length);
		for(String w:splitByChar)
		{  
			System.out.println(w);  
		}
		int a=50;
		System.out.println(String.valueOf(a));
		System.out.println("Array length: "+splitByChar.length);
		System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  
		System.out.println(Pattern.matches("[amn]?", "mn"));//true
		String email="vidhishah125@email.com";
		String email1="sample?examplemail@gmail.com";
		String email2="sample.123@gmail.com";
		String email3="raja$test@gmail.com";
		System.out.println(Pattern.matches("[a-zA-Z0-9_.]+@(gmail|yahoo).com{1}", email));
		System.out.println(Pattern.matches("\\w+@gmail.com{1}", email1));
		System.out.println(Pattern.matches("[\\w.-_]+@gmail.com{1}", email2));
		System.out.println(Pattern.matches("\\w+@gmail.com{1}", email3));
	}

}
