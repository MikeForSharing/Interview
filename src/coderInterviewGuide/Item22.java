package coderInterviewGuide;

public class Item22 {
	
	public int[] getDp(int[] arr) {
		int[] dp = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			dp[i] = 1;
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		return dp;
	}
	
	public int[] getLis(int[] arr,int[] dp){
		int len = 0;
		int index = 0;
		for(int i=0;i<dp.length;i++) {
			if(len<dp[i]){
				len = dp[i];
				index = i;
			}
		}
		int[] lis = new int[len];
		lis[--len] = arr[index];
		
		for(int i=index;i>=0;i--) {
			if(arr[i]<arr[index]&&dp[i] == dp[index] -1) {
				lis[--len] = arr[i];
				index = i;
			}
		}
		
		return lis;
	} 
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Item22 test = new Item22();
		int[] arr = {2,1,5,3,6,4,8,9,7};
		int[] dp = test.getDp(arr);
//		for(int i=0;i<dp.length;i++) {
//			System.out.print(dp[i]);
//		}
		int[] res = test.getLis(arr, dp);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]);
		}
	}
}
