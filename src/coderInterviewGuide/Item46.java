package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import com.sun.corba.se.pept.transport.ContactInfo;

public class Item46 {
	
	public static char[] replace(char[] cArr) {
		if (cArr==null||cArr.length==0) {
			return null;
		}
		
		int len = 0;
		int num = 0;
		
		for(len=0;len<cArr.length&&cArr[len]!=0;len++) {
			if (cArr[len]==' ') {
				num++;
			}
		}
		
		int len2 = len + 2 * num - 1;
		for(int i=len-1;i>=0;i--){
			if (cArr[i]!=' ') {
				cArr[len2--] = cArr[i];
			}else {
				cArr[len2--] = '0';
				cArr[len2--] = '2';
				cArr[len2--] = '%';
			}
		}
		return cArr;
		
	}
	

	
	public static void main(String[] args){
		char[] cArr = {'a',' ','b',' ',0,0,0,0,0,0};
		char[] res = Item46.replace(cArr);
		System.out.println(res);
	}
}
