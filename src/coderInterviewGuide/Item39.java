package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Item39 {
	
	private static int numSum(String str) {
		if(str==null) {
			return 0; 
		}
		
		int res = 0;
		int num = 0;
		boolean flag = true;
		int cur = 0;
		for(int i=0;i<str.length();i++) {
			cur = str.charAt(i)-'0';
			if(cur<0 || cur>9) {
				res += num;
				num = 0;
				if(str.charAt(i) == '-') {
					if(str.charAt(i-1)=='-' && i-1>-1) {
						flag = !flag;
					}else {
						flag = false;
					}
				}else {
					flag = true;
				}
				
			}else {
				num = num*10 +(flag?cur:-cur);
			}
		}
		res += num;
		return res;
	}
	


	public static void main(String[] args){
		
		int res = Item39.numSum("123f3");
		System.out.println(res);
	}
}
