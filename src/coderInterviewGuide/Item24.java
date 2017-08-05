package coderInterviewGuide;

public class Item24 {

	public static void main(String[] args) {
		
		int[] arr = {5,2,3};
		int[][] res = Item24.minCurrency(arr, 20);
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[0].length;j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
	
	public static int[][] minCurrency(int[] arr, int aim) {
		if(aim<0 || arr.length==0||arr==null) {
			return null;
		}
		
		int arrLen = arr.length;
		int[][] dp = new int[arrLen][aim+1];
		
		int max = Integer.MAX_VALUE;
		
		//先将dp的第一行填充完毕，即零钱只有arr[0]的情况下，兑换钱币的数量
		for(int i=1;i<=aim;i++) {
			dp[0][i] = max;
			if(i>=arr[0]&&dp[0][i-arr[0]]!=max) {
				dp[0][i] = dp[0][i-arr[0]]+1;
			}
		}
		//剩下的位置，从左到右，从上到下对dp进行填充
		for(int i=1;i<arrLen;i++) {
			for(int j=1;j<=aim;j++) {
				int left = max;
				if(j>=arr[i] && dp[i][j-arr[i]]!=max) {
					left = dp[i][j-arr[i]] + 1;
				}
				dp[i][j] = Math.min(dp[i-1][j], left);
			}
		}
//		return dp[arrLen-1][aim] !=max ? dp[arrLen-1][aim] : -1;
		return dp;
	}

}
