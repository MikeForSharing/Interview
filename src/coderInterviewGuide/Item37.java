package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Item37 {
	public static int generalMethod(int n) {
		if(n<1) {
			return 0;
		}
		int[] record = new int[n];
		int res = nQueue(0,record,n);
		return res;
	}
	
	
	private static int nQueue(int i,int[] record, int n) {
		if(i == n) {
			return 1; 
		}
		// TODO Auto-generated method stub
		int res = 0;
		for(int j=0;j<n;j++) {
			record[i] = j;
			if(isValid(record,i,j)) {
				res += nQueue(i+1, record, n);
			}
		}
		return res;
	}
	
	private  static boolean isValid(int[] record,int i,int j) {
		for(int k=0;k<i;k++) {
			if(j == record[k] || Math.abs(i-k)==Math.abs(j-record[k]) ) {
				return false;
			}
		}
		return true;
	}





	public static void main(String[] args){
		
		int res = Item37.generalMethod(8);
		System.out.println(res);
	}
}
