package trial;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args) {
		
		int[][] spiralMatrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	 System.out.println(spiralOrder(spiralMatrix));
	}
	
	private static List<Integer> spiralOrder(int[][] matrix){
		int n = matrix.length;
		int m = matrix[0].length;
		int rowStart = 0;
		int rowEnd = n-1;
		int colStart = 0;
		int colEnd = m -1;
		List<Integer> ans = new ArrayList<>();
		while(rowStart<=rowEnd && colStart<=colEnd) {
			for(int j = colStart; j<=colEnd;j++) {
				ans.add(matrix[rowStart][j]);
			}
			rowStart++;
			for(int i = rowStart;i<=rowEnd;i++) {
				ans.add(matrix[i][colEnd]);
			}
			colEnd--;
			if(rowStart<=rowEnd) {
				for(int j=colEnd;j>=colStart;j--) {
					ans.add(matrix[rowEnd][j]);
				}
			}
			rowEnd--;
			if(colStart<=colEnd) {
				for(int i=rowEnd;i>=rowStart;i--) {
					ans.add(matrix[i][colStart]);
				}
			}
			colStart++;
		}
		return ans;
		
	}
}
