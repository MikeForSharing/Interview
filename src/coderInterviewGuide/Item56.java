package src.coderInterviewGuide;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Item56 {
	
	public void adjust(int[] arr) {
		if (arr.length!=0&&arr==null) {
			return ;
		}
		
		int even=0;
		int odd = 1;
		int end = arr.length - 1;
		while (odd<end&&even<end) {
			if ((arr[end]&1)==0) {
				swap(arr, even,end);
				even +=2;
			}else {
				swap(arr,odd,end);
				odd +=2;
			}
			
		}
		
	}
	
	private void swap(int[] arr, int index1, int index2) {
		// TODO Auto-generated method stub
		int tmp;
		tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
		
	}




	public static void main(String[] args){
		int[] arr = {3,1,2,4,5};
		new Item56().adjust(arr);
		System.out.println(Arrays.toString(arr));
	}
}
