package src.Sort;

import java.util.Arrays;

public class MergeSort {

	public void sort(int[] arr,int left,int right) {
		int mid = (left+right)/2;
		if (left<right) {
			sort(arr, left, mid);
			sort(arr, mid+1, right);
			merge(arr,mid,left,right);
		}
	}
	
	public void merge(int[] arr,int mid,int left,int right) {
		int[] tmp = new int[right-left+1];
		int i = left;
		int j = mid+1;
		int k = 0;
		
		while(i<=mid&&j<=right) {
			if (arr[i]<arr[j]) {
				tmp[k++] = arr[i++];
			}else {
				tmp[k++] = arr[j++];
			}
		}
		while(i<=mid) {
			tmp[k++] = arr[i++];
		}
		while (j<=right) {
			tmp[k++] = arr[j++];
		}
		for (int l = 0; l<tmp.length ; l++) {
			arr[l+left] = tmp[l];
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {5,2,4,1,6};
		new MergeSort().sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

}
