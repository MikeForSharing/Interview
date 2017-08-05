package coderInterviewGuide;

public class Item25 {
	
	
	
	
	public int[][] minPathSum1(int[][] m) {
		if(m==null||m.length==0||m[0]==null||m[0].length==0) {
			return null;
		}
		int row = m.length;
		int colum = m[0].length;
		
		int[][] dp = new int[row][colum];
		dp[0][0] = m[0][0];
		for(int i=1;i<row;i++) {
			dp[i][0] = dp[i-1][0] + m[i][0];
		}
		
		for(int i=1;i<colum;i++) {
			dp[0][i] = dp[0][i-1] + m[0][i];
		}
		
		for(int i=1;i<row;i++) {
			for(int j=1;j<colum;j++) {
				dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + m[i][j];
			}
		}
		return dp;
	}
	
	
	
	
	public static void main(String[] args) {
		int[][] m = {{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
//		for(int i=0;i<m.length;i++) {
//			for(int j=0;j<m[0].length;j++) {
//				System.out.print(m[i][j] + " ");
//			}
//			System.out.println();
//		}
		Item25 mp = new Item25();
		int[][] res = mp.minPathSum1(m);
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[0].length;j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
}
