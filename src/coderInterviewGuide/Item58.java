package src.coderInterviewGuide;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Item58 {
	
	public int MatrixMaxSum(int[][] arr) {
		if (arr.length==0||arr==null) {
			return 0;
		}
		int cur = 0;

		int max = Integer.MIN_VALUE;
		int[] s = null;

		for (int i = 0; i < arr.length; i++) {
			s = new int[arr[0].length];
			for (int j = i; j < arr.length; j++) {
				cur = 0;
				for (int k = 0; k < s.length; k++) {
					s[k] += arr[j][k];
					cur += s[k];
					max = Math.max(max, cur);
					cur = cur <0 ? 0 :cur;
				}
			}
		}
		return max;
	}
	
	public static void main(String[] args){
		int[][] arr = {{-1,2,3},{4,5,6}};
		int res = new Item58().MatrixMaxSum(arr);
		System.out.println(res);
	}
}
