package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Item38 {
	
	private static boolean isDeformed(String str1,String str2) {
		if(str1.length() != str2.length()) {
			return false; 
		}
		
		int[] map = new int[256];
		
		for(int i=0;i<str1.length();i++) {
			map[str1.charAt(i)]++;
		}
		for(int i=0;i<str2.length();i++) {
			if(--map[str2.charAt(i)]<0) {
				return false;
			}
		}
		return true;
	}
	


	public static void main(String[] args){
		
		boolean res = Item38.isDeformed("1233", "1223");
		System.out.println(res);
	}
}
