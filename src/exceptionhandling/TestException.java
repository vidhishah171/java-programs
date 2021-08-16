package exceptionhandling;

import java.util.*;

public class TestException {

	void validate(int age) throws CustomException {
		if (age < 18) {
			throw new CustomException("Sorry, you can't go for the trip.");
		} else {
			System.out.println("Holla! You can go for the trip.");
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey! Please Enter your age: ");
		int age=sc.nextInt();
		TestException test = new TestException();
		try {
			try {
				age = sc.nextInt();

			} catch (Exception e) {
				sc.nextLine();
				System.out.println("Please enter a number: ");
				age = sc.nextInt();
				// age = Integer.valueOf(sc.next());
				// age=15;
				// System.out.println("Checking..");
			}
			test.validate(age);
		} catch (CustomException ce) {
			System.out.println("Custom Exception Occured: " + ce);
		} catch (Exception e) {
			System.out.println("Exception occured: " + e);
		} finally {
			System.out.println("Thank you!");
		}
		//test.validate(age);
		System.out.println("Okay. See ya!");
	}

}
