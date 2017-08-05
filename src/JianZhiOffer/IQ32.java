package JianZhiOffer;

import java.util.ArrayList;

public class IQ32 {
	
	public int NumberOfBetween1AndN_Solution(int n) {
		int number = 0;
		for(int i=1;i<=n;i++) {
			number += NumberOf1(i);
		}
		return number;
	
	}
	
	public int NumberOf1(int n) {
		int num = 0;
		while(n>0) {
			if(n%10==1) {
				num++;
			}
			n=n/10;
		}
		return num;
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		int result = new IQ32().NumberOfBetween1AndN_Solution(13);
		System.out.println(result);

	}

}
