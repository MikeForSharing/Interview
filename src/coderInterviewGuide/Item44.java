package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import com.sun.corba.se.pept.transport.ContactInfo;

public class Item44 {
	
	public static boolean isOneChar(String str) {
		if (str==null || str.length()==0) {
			return true;
		}
		char[] cArr = str.toCharArray();
		boolean[] map = new boolean[256];
		for (int i = 0; i < cArr.length; i++) {
			if (map[cArr[i]]) {
				return false;
			}
			map[cArr[i]] = true;
		}
		return true;
	}
	

	
	public static void main(String[] args){
		
		boolean res = Item44.isOneChar("abac");
		System.out.println(res);
	}
}
