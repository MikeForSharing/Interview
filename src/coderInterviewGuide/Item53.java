package src.coderInterviewGuide;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import com.sun.corba.se.pept.transport.ContactInfo;
import com.sun.org.apache.bcel.internal.generic.DCMPG;
import com.sun.org.apache.regexp.internal.recompile;

public class Item53 {
	
	public  int getMinLength(int[] arr) {
		if (arr.length<2||arr == null) {
			return 0;
		}
		
		int min = arr[arr.length-1];
		int minIndex = -1;
		for (int i = arr.length-2; i >=0; i--) {
			if (arr[i]>min) {
				minIndex = i;
			}else {
				min = arr[i];
			}
		}
		
		
		int max = arr[0];
		int maxIndex = -1;
		for (int i = 1; i <= arr.length-1; i++) {
			if (arr[i]<max) {
				maxIndex = i;
			}else {
				max = arr[i];
			}
		}
		
		System.out.println(minIndex + " " + maxIndex);
		return maxIndex - minIndex + 1;
		
	}
	
	

	public static void main(String[] args){
		int[] arr = {1,4,5,3,2,6,7};
		int res = new Item53().getMinLength(arr);
		System.out.println(res);
	}
}
