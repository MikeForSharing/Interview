package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import com.sun.corba.se.pept.transport.ContactInfo;
import com.sun.org.apache.regexp.internal.recompile;

public class Item49 {
	
	public static boolean brackerIsValid(String str) {
		char[] cArr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i]!='(' && cArr[i]!=')') {
				return false;
			}
			if (cArr[i]==')' && --count<0) {
				return false;
			}
			if (cArr[i]=='(') {
				count++;
			}
		}
		return count == 0;
	}
	

	
	
	public static void main(String[] args){
		boolean res = Item49.brackerIsValid("()");
		System.out.println(res);
	}
}
