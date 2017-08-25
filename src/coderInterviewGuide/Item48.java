package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import com.sun.corba.se.pept.transport.ContactInfo;
import com.sun.org.apache.regexp.internal.recompile;

public class Item48 {
	
	public static int minDistance(String[] strs, String s1, String s2) {
		if (s1==null||s2==null) {
			return -1;
		}
		if (s1==s2) {
			return -1;
		}
		
		int last1 = -1;
		int last2 = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].equals(s1)) {
				min = Math.min(min, last2 == -1 ? min : i - last2);
				last1 = i;
			}
			if (strs[i].equals(s2)) {
				min = Math.min(min, last1 == -1?min:i-last1);
				last2 = i;
			}
		}
		return min==Integer.MIN_VALUE ? -1 : min;
	}
	

	
	
	public static void main(String[] args){
		String[] strs = {"a","b","a","c","d"};
		int res = Item48.minDistance(strs, "a", "d");
		System.out.println(res);
	}
}
