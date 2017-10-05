package src.coderInterviewGuide;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.SWAP;


public class Item62 {
	
	public int[] leftUniqueSort(int[] arr) {
		if (arr.length==0 || arr == null) {
			return null;
		}
		int u=0;
		int i=1;
		while (i<arr.length) {
			if (arr[u] != arr[i]) {
				swap(arr,++u,i);
				
			}
			i++;
		}
		return arr;
	}
	
	
	private void swap(int[] arr, int i, int j) {
		int tmp=0;
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}


	public static void main(String[] args){
		int[] arr = {1,2,2,3,3,4,5};
		int[] res = new Item62().leftUniqueSort(arr);
		System.out.println(Arrays.toString(res));
	}
}
