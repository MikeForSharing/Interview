package src.coderInterviewGuide;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.SWAP;


public class Item64 {
	
	public int gcd(int m,int n) {
		return n==0 ? m : gcd(n, m%n); 
	}
	
	public static void main(String[] args){
		
		int res = new Item64().gcd(9, 6);
		System.out.println(res);
	}
}
