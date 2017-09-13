package src.coderInterviewGuide;

import java.util.Arrays;

public class Item55 {
	
	public int getLen(int[] arr) {
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if (isInteger(arr,i,j)) {
					max = Math.max(max, j-i+1);
				}
			}
		}
		return max;
	}
	
	
	public  boolean isInteger(int[] arr,int left,int right) {
		int[] newArr = Arrays.copyOfRange(arr, left, right+1);
		Arrays.sort(newArr);
		for (int i = 0; i < newArr.length-1; i++) {
				if (arr[i] != arr[i+1]-1) {
					return false;
				}
		}
		return true;
	}
	

	public static void main(String[] args){
		int[] arr = {1,2,3};
		int res = new Item55().getLen(arr);
		System.out.println(res);
	}
}
