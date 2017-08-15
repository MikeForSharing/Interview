package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Item42 {
	
	public static String replace(String str,String from,String to) {
		if (str == null||from == null) {
			return str;
		}
		char[] chas = str.toCharArray();
		char[] chaq = from.toCharArray();
		int index = 0;
		for (int i = 0; i < chas.length; i++) {
			if (chas[i]==chaq[index]) {
				index++;
				if (index == chaq.length) {
					clear(chas,i,chaq.length);
					index = 0;
				}
			}
		}
		
		String cur = "";
		String res = "";
		for (int i = 0; i < chas.length; i++) {
			if (chas[i]!=0) {
				cur += chas[i];
			}
			if (chas[i] ==0 &&(i==0 || chas[i-1]!=0)) {
				res = res + cur + to;
				cur = "";
			}
		}
		if(!cur.equals("")) {
			res = res + cur;
		}
		
		return res;
		
	}
	

	
	private static void clear(char[] chas, int end, int length) {
		while (length--!=0) {
			chas[end--] = 0;
		}
	}



	

	public static void main(String[] args){
		
		String res = Item42.replace("abcjksdf", "ab", "111");
		System.out.println(res);
	}
}
