package src.coderInterviewGuide;

import java.util.Arrays;


public class Item61 {
	public int[] multiply(int[] arr) {
		int count = 0;
		int all = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				count++;
			}else {
				all *= arr[i];
			}
		}
		if (count==0) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = all/arr[i];
			}
		}
		if (count==1) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]==0) {
					arr[i] = all;
				}else {
					arr[i] =0;
				}
			}
		}
		return arr;
	}
	
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4};
		int[] res = new Item61().multiply(arr);
		System.out.println(Arrays.toString(res));
	}
}
