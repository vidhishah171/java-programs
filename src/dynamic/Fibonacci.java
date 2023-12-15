package dynamic;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	public static void main(String[] args) {
		System.out.println(fibNew(46));
//		    n : 0 1 2 3 4 5 6  7  8
//		fib(n): 0 1 1 2 3 5 8 13 21...
//		The 7th fibonacci number is 13. ( will solve this recursively. ) fib(6) = 8.
//		fib(6) = fib(5) + fib(4)
//		fib(5) = fib(4) + fib(3)
//		fib(3) = fib(2) + fib(1)
//		fib(n) = fib(n-1) + fib(n-2) 
//		fib(0) = 0;    fib(1) = 1;
//		This is asymmetric tree. let's try to do this symmetrically and find time complexity and nodes.
		
		
//		time (no of nodes): 2^n -1 = O(2^n)
//		space complexity would be similar to stack calls.
//		space: O(n). Here we counted complexity for fib(n-1) + fib(n-1). 
//		so complexity of Fibonacci series would be the same as it is fib(n-1) + fib(n-2).
//		Exponential complexity is not good enough, there's always a better way to do this.
//		Efficient solution:
//		Here, we will try to remove duplicates by storing the results in data structures. ie. hashmap.
//		Here, when i increase the size of n, only two nodes are added to the tree. So the space and time complexity would be O(2n) = O(n).
		
		
		// First solve by using brute force recursion and then additionally adding memo recursion to it. 
	}

	/** default recursion method.
	 * @param n
	 * @return
	 */
	public static int fib(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
	
	public static int fibMap(int n, HashMap<Integer, Integer> memo) {
		if(n == 0 || n == 1) {
			return n;
		}
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
		int result = fibMap(n-1, memo) + fibMap(n-2, memo);
		memo.put(n, result);
		return result;
	}
	
	public static int fibNew(int n) {
		return fibMap(n, new HashMap<>());
	}
}
