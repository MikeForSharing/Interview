package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

public class IQ29 {
	public int MoreThanHalfNum_Solution(int[] array) {
		if(array == null) {
			return 0;
		}
		int count = 0;
		int result = 0;
		for(int i=0;i<array.length;i++) {
			if(count ==0) {
				result = array[i];
				count=1;
			}else if(array[i] == result) {
				count++;
			}else{
				count--;
			}
		}
		
		if(checkMoreThanHalfNum(array, result)) {
			return result;
		}else{
			return 0;
		}
		
	}
	
	public boolean checkMoreThanHalfNum(int[] array,int result) {
		int num = 0;
		for(int i=0;i<array.length;i++) {
			if(result == array[i]) {
				num++;
			}
		}
		if(num*2<=array.length) {
			return false;
		}else {
			return true;
		}
	}
	
	public static void main(String[] args) throws Exception {
		String str = "abc";
		int[] array = {1,3,3,3,4};
		int result = new IQ29().MoreThanHalfNum_Solution(array);
		System.out.println(result);
	}

}
