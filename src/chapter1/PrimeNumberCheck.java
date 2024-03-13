package chapter1;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		sc.close();
		int count = 0;
		for (int i = 1; i <= value; i++) {
			if (value % i == 0) {
				count++;
			}
		}
		if (count <= 2) {
			System.out.println("A Prime number.");
		} else {
			System.out.println("Not a Prime number.");
		}
		/*
		 * System.out.println("Count is: " + count);
		 * System.out.println("Optimizing this. here the loop runs N times.");
		 */
//		System.out.println((int) Math.sqrt(value));
		int modifiedCodeCount = 0;
		for (int i = 1; i <= Math.sqrt(value); i++) {
			if (value % i == 0) {
				if (i == (value / i)) {
					modifiedCodeCount++;
				} else {
					modifiedCodeCount = modifiedCodeCount + 2;
				}
			}
		}
		if (count <= 2) {
			System.out.println("A Prime number using 2nd method.");
		} else {
			System.out.println("Not a Prime number using 2nd method.");
		}
		/*
		 * System.out.println("Modified logic Count is: " + modifiedCodeCount);
		 */
//		System.out.println("Optimized. here the loop runs root N times: takes ceiling.");
		if (checkIfItsPrime(value)) {
			System.out.println("Prime number using my approach");
		} else {
			System.out.println("Not a Prime number using my approach");

		}
	}

	static boolean checkIfItsPrime(int value) {
		System.out.println(
				"Here the loop runs even less than Sqrt of N times, as it does not check for odds. "
				+ "Also we return directly when factor count exceeds two.");
		if (value == 2) {
			return true;
		} else if (value % 2 == 0) {
			return false;
		} else {
			for (int i = 3; i <= Math.sqrt(value); i = i + 2) {
				if (value % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}
