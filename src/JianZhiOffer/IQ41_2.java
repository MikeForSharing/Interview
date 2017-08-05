package JianZhiOffer;

import java.util.ArrayList;

public class IQ41_2 {
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(sum<3) {
			return result;
		}
		int small = 1;
		int big = 2;
		while(small != big) {
			ArrayList<Integer> group = new ArrayList<Integer>();
			int sumTmp = 0;
			for(int i=small;i<=big;i++) {
				sumTmp += i;
			}
			if(sumTmp < sum) {
				big++;
			}else if(sumTmp > sum) {
				small++;
			}else{
				for(int i=small;i<=big;i++) {
					group.add(i);
				}
				result.add(group);
				big++;
			}

		}
		
		return result;
	}
	
	
	public static void main(String[] args) throws Exception {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result = new IQ41_2().FindContinuousSequence( 5);
		System.out.println(result);
	}
	
	
 
	
}
