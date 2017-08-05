package JianZhiOffer;

import java.util.ArrayList;

public class IQ30 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer>  result = new ArrayList<Integer>();

		if(k>input.length || k==0) {
			return result;
		}
		int start = 0;
		int end = input.length - 1;
		int index = partition(input,start,end);
		while(index != k-1) {
			if(index>k-1) {
				index = partition(input,start,index-1);
			}else{
				index = partition(input,index+1,end);
			}
		}
		for(int i=0;i<k;i++) {
			result.add(input[i]);
		}
		return result;
	}
	
	public int partition(int[] array, int low, int high) {
		int key = array[low];
		while(low<high) {
			while(array[high]>=key&&low<high) {
				high--;
			}
			int tmp = array[high];
			array[high] = array[low];
			array[low] = tmp;
			while(array[low]<=key&&low<high) {
				low++;
			}
			int tmp2 = array[low];
			array[low] = array[high];
			array[high] = tmp2;
		}
		array[high] = key;
		return low;
	}
	
	
	public static void main(String[] args) throws Exception {
		int[] array = {3,1,2,5,4};

		ArrayList<Integer> result = new IQ30().GetLeastNumbers_Solution(array, 4);
		System.out.println(result);

	}

}
