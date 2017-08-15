package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Item41 {
	
	public static boolean isValid(String str) {
		char[] charArr = str.toCharArray();
		if (charArr[0] !='-'&&(charArr[0]<'0'||charArr[0]>'9')) {
			
		}
		if (charArr[0] =='-' && (charArr.length==1||charArr[1]=='0')) {
			return false;
		}
		if (charArr[0] == '0' && charArr.length >1) {
			return false;
		}
		for (int i = 1; i < charArr.length; i++) {
			if (charArr[i]<='0'||charArr[i]>='9') {
				return false;
			}
		}
		return true;
	}
	

	
	public static int convert(String str) {
		if (str==null||str.length()==0) {
			return 0;
		}
		char[] cArr = str.toCharArray();
		if (!isValid(str)) {
			return 0;
		}
		
		int cur = 0;
		int minq = Integer.MIN_VALUE/10;
		int minr = Integer.MIN_VALUE%10;
		int res = 0;
		
		boolean posi = cArr[0]=='-' ? false : true;
		for (int i = posi ?0:1; i < cArr.length; i++) {
			cur = '0' - cArr[i];
			if (res<minq || (res==minq && cur<minr)) {
				return 0;
			}
			res = res*10 + cur;
		}
		if (posi && res==Integer.MIN_VALUE) {
			return 0;
		}
		return posi ? -res : res;
	}

	public static void main(String[] args){
		
		int res = Item41.convert("124323");
		System.out.println(res);
	}
}
