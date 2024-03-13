package chapter1;

import java.util.Scanner;

public class FactorCount {

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
		System.out.println("Count is: " + count);
		System.out.println("Optimizing this. here the loop runs N times.");
		System.out.println((int) Math.sqrt(value));
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
		System.out.println("Modified logic Count is: " + modifiedCodeCount);
		System.out.println("Optimized. here the loop runs root N times: takes ceiling.");

	}
}
