package src.coderInterviewGuide;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Item57 {
	
	public int maxSum(int[] arr) {
		if (arr.length==0||arr==null) {
			return 0;
		}
		
		int cur = 0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			cur += arr[i];
			if(cur<0) {
				cur = 0;
			}
			max = Math.max(max, cur);
		}
		return max;
	}
	



	public static void main(String[] args){
		int[] arr = {-3,1,2,4,-5};
		int res = new Item57().maxSum(arr);
		System.out.println(res);
	}
}
