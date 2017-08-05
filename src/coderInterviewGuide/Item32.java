package coderInterviewGuide;

public class Item32 {
	public static int[][] dp(String str1,String str2) {
		if(str1.length() ==0||str1 == null||str2.length()==0||str2==null){
			return null;
		}
		int[][] dp = new int[str1.length()][str2.length()];
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i) == str2.charAt(0)) {
				dp[i][0] = 1;
			}else {
				dp[i][0] = 0;
			}
		}
		
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i)==str1.charAt(0)) {
				dp[0][i] = 1;
			}else{
				dp[0][i] = 0;
			}
		}
		
		for(int i=1;i<str1.length();i++) {
			for(int j=1;j<str2.length();j++) {
				dp[i][j] = 0;
				if(str1.charAt(i) == str2.charAt(j)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else {
					dp[i][j] = 0;
				}
			}
		}

		return dp;
	}
	
	public static String getCommonString(String str1,String str2) {
		int[][] dp = dp(str1,str2);
		int len = 0; //len表示公共字符串的最大长度
		int index = 0;//代表dp中最长字符串在第几行
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				if(len<dp[i][j]) {
					len = dp[i][j];
					index = i;
				}
			}
		}
		return str1.substring(index-len+1, index+1);
	}
	
	public static void main(String[] args){
		String res = Item32.getCommonString("12342", "512345");
		System.out.println(res);
	}
}
