package JianZhiOffer;

import java.util.Arrays;

public class IQ44 {

	
	public boolean isContinuous(int[] numbers) {
		if(numbers.length == 0) {
			return false;
		}
		//给数组排序
		Arrays.sort(numbers);
		int numOfZero = 0;
		int numOfGap = 0;
		
		//计算大小王的个数
		for(int i=0;i<numbers.length&&numbers[i]==0;i++) {
			numOfZero++;
		}
		
		int small = numOfZero;
		int big = small+1;
		
		//计算间隔数目
		while(big<numbers.length) {
			if(numbers[small] == numbers[big]) {
				return false;
			}
			numOfGap += numbers[big] - numbers[small] -1;
			small = big;
			big++;
		}
		return numOfZero < numOfGap ? false : true;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,4,6,0};
		IQ44 test = new IQ44();
		boolean result = test.isContinuous(arr);
		System.out.println(result);
	}

}
