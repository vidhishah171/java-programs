package assignments;

/**
 * @author Vidhi_s <br>
 *         Constraints: 1<=N, M<=10^5 <br>
 *         1<=a[i]<=10^9 <br>
 *         0<=L<=R<N <br>
 *         Array A of length N. <br>
 *         2D Array with dimensions M*2. <br>
 *         M is pair of L and R. <br>
 *         Find sum of all elements from [L,R]. <br>
 *         Time Complexity: O(N), Space complexity: O(N)
 *
 */
public class PrefixSum3 {

	public static long[] rangeSum(int[] inputArray, int[][] b) {
		long[] prefixSum = new long[inputArray.length]; //10^14 max value
		// Find and create prefixSum array.
		for (int i = 0; i < inputArray.length; i++) {
			if (i == 0) {
				prefixSum[i] = inputArray[i];
			} else {
				prefixSum[i] = prefixSum[i - 1] + inputArray[i];
			}
		}
//		Traverse through array for L and R.
//		Find them and use formula PS[L,R] = PS[R] - PS[L-1]. If L == 0, <br>
//		then PS[L,R] = PS[R].
		long[] answer = new long[b.length]; // 10^15 max value, 10^5 max length
		for (int i = 0; i < b.length; i++) { // 10^5 max itr
			if (b[i][0] == 0) {
				answer[i] = prefixSum[b[i][1]];
			} else {
				answer[i] = prefixSum[b[i][1]] - prefixSum[b[i][0] - 1];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] inputArray = {1,2,3,4,5};
		int[][] b = {{0,3},{1,2},{1,4}};
//		int[] inputArray = {2,2,2};
//		int[][] b = {{0,0},{1,2}};
		long[] answer = rangeSum(inputArray, b);
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
}
