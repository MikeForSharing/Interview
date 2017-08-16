package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import com.sun.corba.se.pept.transport.ContactInfo;

public class Item43 {
	
	public static String getCountString(String str) {
		if (str==null||str.length()==0) {
			return null;
		}
		
		char[] cArr = str.toCharArray();
		String res = String.valueOf(cArr[0]);
		int num = 1;
		for (int i = 1; i < cArr.length; i++) {
			if (cArr[i]!=cArr[i-1]) {
				res = Contact(res,String.valueOf(num),String.valueOf(cArr[i]));
				num = 1;
			}else {
				num++;
			}
		}
		
		return Contact(res, String.valueOf(num), "");
		
	}
	

	private static String Contact(String res, String num, String s3) {
		// TODO Auto-generated method stub
		return res + "_" + num + (s3.equals("") ? s3 : "_" + s3);
	}









	public static void main(String[] args){
		
		String res = Item43.getCountString("aabbbcc");
		System.out.println(res);
	}
}
