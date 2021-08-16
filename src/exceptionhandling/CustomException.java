package exceptionhandling;

public class CustomException extends Exception {
	CustomException(String s)
	{
		super(s);
		//System.out.println(s);
	}
}
