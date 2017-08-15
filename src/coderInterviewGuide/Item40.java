package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Item40 {
	
	private static String removeKZeros(String str,int k) {
		if(str==null|k<1) {
			return str;
		}
		int count = 0;
		int start = -1;
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i] =='0') {
				start = start == -1? i:start;
				count++;
			}else {
				if (count == k) {
					while (count--!=0) {
						array[start++] = 0;
					}
				}
				count = 0;
				start = -1;
			}
		}
		
		if (count == k) {
			while (count--!=0) {
				array[start++] = 0;
			}
		}
		return String.valueOf(array);
	}
	


	public static void main(String[] args){
		
		String res = Item40.removeKZeros("fa00dfs", 2);
		System.out.println(res);
	}
}
