package assignments;

public class SubArraySum3 {

	private static int[] getSubArrayFromInput(int[] A, int N) {

		int[] answer = new int[N];
		for(int i=0; i<N;i++) {
			int sum=0;
			for(int j=i;j<N;j++) {
				// here we have start and end indexes of the subarrays. 
				sum+= A[j];
				System.out.println(sum);
			}
		}
		return answer;
	} 
	
	public static void main(String[] args) {
		int[] A = {6,7,1,5};
		getSubArrayFromInput(A, A.length);
	}
	
//	6 = 6
//	6,7 = 13
//	6,7,1 = 14
//	6,7,1,5 = 19
//	7=7
//	7,1=8
//	7,1,5=13
//	1=1
//	1,5=6
//	5=5
	

}
