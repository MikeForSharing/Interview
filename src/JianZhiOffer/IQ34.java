package JianZhiOffer;

import java.util.ArrayList;

public class IQ34 {

	private int GetUglyNumber_Solution(int index) {
		if(index<0) 
			return 0;
		int array[] = new int[index];
		array[0] = 1;
		int multiply2 = 1;
		int multiply3 = 1;
		int multiply5 = 1;
		for(int i=1;i<array.length;i++) {
			int min = min(multiply2*2,multiply3*3,multiply5*5);
			System.out.println(min);
			array[i] = min;
			while(multiply2*2<=min) {
				multiply2++;
			}
			while(multiply3*3<=min) {
				multiply3++;
			}
			while(multiply5*5<=min) {
				multiply5++;
			}
		}
		return array[index-1];
	}
	
	public int min(int i, int j, int k) {
		int l = i < j ? i:j;
		return l<k ? l:k;
	}
	
	public static void main(String[] args) throws Exception {
		int result = new IQ34().GetUglyNumber_Solution(11);
//		System.out.println(result);
	}

}
