package assignments;

import java.util.Scanner;

public class SubArrayPrint1 {

	private static void printSubArrayFromInput(int[] A, int N) {
		for(int i=0;i<N; i++) {
			for(int j=i;j<N;j++) {
				// here, we have start index and end index of the subarray.
				printSubArray(A, i, j);
				System.out.println();
			}
		}
	}
	
	private static void printSubArray(int[] A, int start, int end) {
		for(int i=start;i<=end; i++) {
			System.out.print(A[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i =0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		printSubArrayFromInput(A, N);	
		sc.close();
	}

}
