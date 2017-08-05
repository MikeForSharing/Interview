package JianZhiOffer;

import java.util.ArrayList;

public class IQ41 {

	public ArrayList<Integer> FindNumsWithSum(int[] array, int sum) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(array.length<2) {
			return result;
		}
		int start = 0;
		int end = array.length - 1;
		while(start != end) {
			if(array[start] + array[end] < sum) {
				start++;
			}else if(array[start] + array[end] > sum) {
				end--;
			}else{
				result.add(array[start]);
				result.add(array[end]);
				break;
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) throws Exception {
		int[] arr = {1,2,3,4,5};
		ArrayList<Integer> result = new ArrayList<Integer>();
		result = new IQ41().FindNumsWithSum(arr, 5);
		System.out.println(result);
	}
	
	
 
	
}
