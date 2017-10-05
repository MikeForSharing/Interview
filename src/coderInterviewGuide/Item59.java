package src.coderInterviewGuide;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Item59 {
	
	public double maxMultiply(double[] arr) {
		if (arr.length ==0|| arr==null) {
			return 0;
		}
		
		double max = arr[0];
		double min = arr[0];
		double res = arr[0];
		double minEnd = 0;
		double maxEnd = 0;
		for (int i = 1; i < arr.length; i++) {
			minEnd = min*arr[i];
			maxEnd = max*arr[i];
			max = Math.max(Math.max(maxEnd, minEnd), arr[i]);
			min = Math.min(Math.min(maxEnd, minEnd), arr[i]);
			
			res = Math.max(max, res);
		}
		return res;
		
		
	}
	
	public static void main(String[] args){
		double[] arr = {1,2,-3,4};
		double res = new Item59().maxMultiply(arr);
		System.out.println(res);
	}
}
