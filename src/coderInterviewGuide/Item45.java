package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import com.sun.corba.se.pept.transport.ContactInfo;

public class Item45 {
	
	public static int getIndex(String[] strs, String str) {
		if (strs==null||strs.length==0||str==null) {
			return -1;
		}
		
		int res = -1;
		int left = 0;
		int right = strs.length - 1;
		int mid = 0;
		int i=0;
		while (left<right) {
			mid = (left + right) / 2;
			if (strs[mid] == str) {
				res = mid;
				right = mid - 1;
			}else if (strs[mid] != null) {
				if (strs[mid].compareTo(str) < 0) {
					left = mid + 1;
				}else {
					right = mid -1;
				}
			}else {
				i = mid;
				while (strs[i]==null&&--i>left) {
					;
				}
				if (i<left||strs[i].compareTo(str) < 0) {
					left = mid + 1;
				}else {
					res = str.equals(strs[i]) ? i : res;
					right = mid - 1;
				}
			}
		}
		return res;
	}
	

	
	public static void main(String[] args){
		String[] strs = {"a", "a", "b","null","m"};
		int res = Item45.getIndex(strs, "b");
		System.out.println(res);
	}
}
