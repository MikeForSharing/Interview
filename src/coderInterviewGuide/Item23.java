package coderInterviewGuide;

public class Item23 {
	public static int[][] getdp(char[] str1,char[] str2) {
		if(str1==null||str2==null||str1.length==0||str2.length==0) {
			return null;
		}
		
		int[][] dp = new int[str1.length][str2.length];
		dp[0][0] = str1[0]==str2[0]? 1 : 0;
		
		for(int i=1;i<str1.length;i++) {
			dp[i][0] = 0;
			if(str2[0] == str1[i]) {
				dp[i][0] = 1;
			}
		}
		for(int i=1;i<str2.length;i++) {
			dp[0][i] = 0;
			if(str1[0]== str2[i]) {
				dp[0][i] = 1;
			}
		}
		
		for(int i=1;i<str1.length;i++) {
			for(int j=1;j<str2.length;j++) {
				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				if(str1[i]==str2[j]) {
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1]+1);
				}
				
			}
		}
		return dp;
	}
	
	
	public static String getLongStr(String str1,String str2) {
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		int[][] dp = getdp(charArr1,charArr2);
		
		int m = charArr1.length - 1;
		int n = charArr2.length - 1;
		char[] res = new char[dp[m][n]];
		int index = res.length - 1;
		while(index>=0) {
			if(m>0&&dp[m][n] == dp[m-1][n]) {
				m--;
			}else if(n>0&&dp[m][n] == dp[m][n-1]) {
				n--;
			}else {
				res[index--] = charArr2[n];
				m--;
				n--;
			}
		}
		
		return String.valueOf(res);
	}
	
	public static void main(String[] args) {
		String str1 = "1341";
		String str2 = "21315";
		String res = Item23.getLongStr(str1, str2);
//		for(int i=0;i<res.length;i++) {
//			for(int j=0;j<res[0].length;j++) {
//				System.out.print(res[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println(res);
		
	}

}
