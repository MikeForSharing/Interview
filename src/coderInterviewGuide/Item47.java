package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import com.sun.corba.se.pept.transport.ContactInfo;

public class Item47 {
	
	public static void rotateStr(char[] cArr) {
		if (cArr==null||cArr.length==0) {
			return ;
		}
		reverse(cArr, 0, cArr.length -1);
		int l = -1;
		int r = -1;
		
//		for (int i = 0; i < cArr.length; i++) {
//			System.out.print(cArr[i]);
//		}
		
		
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] != ' ') {
				l = i==0||cArr[i-1]==' ' ? i : l;
				r = i == cArr.length - 1 || cArr[i+1] == ' ' ? i : r;
			}
			if (r != -1 && l != -1 ) {
				reverse(cArr, l, r);
				r = -1;
				l = -1;
			}
		}
		
		
//		for (int i = 0; i < cArr.length; i++) {
//			System.out.print(cArr[i]);
//
//		}
		
	}
	

	public static void reverse(char[] cArr, int start, int end) {
		char tmp;
		while (start<end) {
			tmp = cArr[start];
			cArr[start++] = cArr[end];
			cArr[end--] = tmp;
		}
	}
	
	public static void main(String[] args){
		String str = new String("i am a student");
		char[] cArr = str.toCharArray();
		Item47.rotateStr(str.toCharArray());
		System.out.println(str);

		
	}
}
