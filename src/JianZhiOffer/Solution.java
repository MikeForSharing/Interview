package JianZhiOffer;

import java.util.LinkedList;

public class Solution {
	public static int n = 0;
	public static int sum = 0;
	public Solution() {
		n++;
		sum += n;
	}
	
	public int Sum_Solution(int n) {
		for(int i=0;i<n-1;i++) {
			Solution test = new Solution();
		}
		 int result = Solution.sum;
		 return result;
	}
		
	public static void main(String[] args) {
//			Solution test = ;
			int result = new Solution().Sum_Solution(5);
			System.out.println(result);
	}

}
