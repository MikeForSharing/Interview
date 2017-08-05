package coderInterviewGuide;

public class Item34 {
	public static boolean isCross(String str1,String str2,String aim) {
		if(str1==null||str2==null||aim==null) {
			return false;
		}
		
		if(str1.length()+str2.length() != aim.length()) {
			return false;
		}
		
		boolean[][] dp = new boolean[str1.length()+1][str2.length()+1];
		dp[0][0] = true;
		
		for(int i=1;i<str1.length()+1;i++) {
			if(str1.charAt(i-1) != aim.charAt(i-1)) {
				break;
			}
			dp[i][0] = true;
		}
		
		for(int i=1;i<str2.length()+1;i++) {
			if(str2.charAt(i-1)!= aim.charAt(i-1)) {
				break;
			}
			dp[0][i] = true;
		}
		
		for(int i=1;i<str1.length()+1;i++) {
			for(int j=1;j<str2.length()+1;j++) {
				if(str1.charAt(i-1)==aim.charAt(i+j-1)&&dp[i-1][j]) {
					dp[i][j]= true;
				}
				if(str2.charAt(j-1)==aim.charAt(i+j-1)&&dp[i][j-1]) {
					dp[i][j] = true;
				}
			}
		}
		
		return dp[str1.length()][str2.length()];
	}
	
	
	public static void main(String[] args){
		boolean res = Item34.isCross("123", "45", "18345");
		System.out.println(res);
	}
}
