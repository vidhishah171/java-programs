package assignments;

public class SubArrayReturn2 {
	
	private static int[][] getSubArrayFromInput(int[] A, int N) {
		int numberOfSubArrays = N*(N+1)/2;
		int[][] answer = new int[numberOfSubArrays][N];
		int index=0;
		for(int i=0; i<N;i++) {
			for(int j=i;j<N && index<numberOfSubArrays;j++, index++) {
				// here we have start and end indexes of the subarrays. 
				answer[index] = getSubArrays(A, i, j);
			}
		}
		return answer;
	} 
	
	private static int[] getSubArrays(int[] A, int start, int end) {
		int[] subArray = new int[end-start+1];
		int index = 0;
		for(int i=start;i<=end && index<(end-start+1);i++, index++) {
			subArray[index] = A[i];
		}
		return subArray;
	}
	
	public static void main(String[] args) {
		int[] A = {6,7,1,5,7,3,8};
		getSubArrayFromInput(A, A.length);
	}

}
