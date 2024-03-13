package chapter1;

public class BinarySearch {

	static int getIndex(int low, int high, int numberToSearch, int[] array) {
		if (low <= high) {
			int midElement = (low + high) / 2;
			if (numberToSearch == array[midElement]) {
				return midElement;
			} else if (numberToSearch < array[midElement]) {
				return getIndex(low, midElement - 1, numberToSearch, array);
			} else {
				return getIndex(midElement + 1, high, numberToSearch, array);
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int[] array = new int[] {-3,-2,0,1,2,3,4,5,7,13,15,56,89,90}; 
		System.out.println(getIndex(0, array.length-1, 5, array));
	}

}
