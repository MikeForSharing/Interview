package src.coderInterviewGuide;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.SWAP;


public class Item65 {
	public int zeroNum(int num) {
		if (num<0) {
			return 0;
		}
		
		int res = 0;
		int cur = 0;
		for (int i = 5; i < num+1; i=i+5) {
			cur = i;
			while(cur%5==0){
				res++;
				cur = cur/5;
			}
		}
		return res;
	}
	
	
	public static void main(String[] args){
		int res = new Item65().zeroNum(6);
		System.out.println(res);
	}
}
