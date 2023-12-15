package assignments;

/**
 * @author Vidhi_s <br>
 *         1<=N<=10^5 <br>
 *         1<=Q<=10^5 <br>
 *         1<=inputArray[i]<=10^9 <br>
 *         0<=B[i][0]<=B[i][1]<N <br>
 *         Time Complexity: O(N), Space Complexity: O(N)
 */
public class PrefixSumEven6 {

	public static int[] countEvenNumbers(int[] inputArray, int[][] queries) {
		long[] prefixSum = new long[inputArray.length]; // 10^14 max value

//		Generally, we first take the temp array and store 1 is number of particular index is 1, else 0. <br>
//		Then we sum the temp array and store it into the same array using formula: PS[i] = PS[i-1] + a[i].
//		But for trial, we are using this currenly.
		for (int i = 0; i < inputArray.length; i++) {

			int numberToAdd = (inputArray[i] % 2 == 0) ? 1 : 0;
			if (i == 0) {
				prefixSum[i] = numberToAdd;
			} else {
				prefixSum[i] = prefixSum[i - 1] + numberToAdd;
			}
		}

//		After our prefix sum array is ready, we'll get L and R from queries array. and calculate even numbers by formula:
//		EvenNumbers[L,R] = PS[R] - PS[L-1], if L==0, then EvenNumber[L,R] = PS[R]
		int[] answer = new int[queries.length]; // Max value: 10^5
		for (int i = 0; i < queries.length; i++) {
			if (queries[i][0] == 0) {
				answer[i] = (int) prefixSum[queries[i][1]];
			} else {
				answer[i] = (int) (prefixSum[queries[i][1]] - prefixSum[queries[i][0] - 1]);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5 };
		int[][] queries = { { 0, 2 }, { 2, 4 }, { 1, 4 } };
		int[] answer = countEvenNumbers(inputArray, queries);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
