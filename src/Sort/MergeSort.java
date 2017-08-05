package Sort;

import java.util.Arrays;

public class MergeSort {
	
    public static void main(String[] args) {  
        int[] arr = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };  
        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length-1);  
        System.out.println(Arrays.toString(arr));  
    }  
	 
	public int[] sort(int[] a,int left,int right) {
		
		int mid = (left+right)/2;
		if(left<right) {
			sort(a,left,mid);
			sort(a,mid+1,right);
			merge(a,left,mid,right);
		}
		
		return a;
	}
		
	private void merge(int[] a, int left, int mid, int right) {
		int[] tmp = new int[right-left+1];
		int lindex = left;
		int index = 0;
		int r1 = mid+1;

		while(lindex<=mid && r1<=right) {
			if(a[lindex] <= a[r1]) {
				tmp[index] = a[lindex];
				
				lindex++;
				index++;
			}else{
				tmp[index] = a[r1];
				r1++;
				index++;
			}
		}
		while(lindex<=mid) {
			tmp[index] = a[lindex];
			index++;
			lindex++;
		}
		while(r1<=right) {
			tmp[index]= a[r1];
			index++;
			r1++;
		}
//		printArr(tmp);
		for(int i=0;i<tmp.length;i++) {
			a[i+left] = tmp[i];
			System.out.print(tmp[i] + " ");
		}
		System.out.println();
	}

}
