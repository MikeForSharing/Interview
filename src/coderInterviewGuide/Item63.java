package src.coderInterviewGuide;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.SWAP;


public class Item63 {
	
	public int randomTo5() {
		return (int) (Math.random()*5 +1);
	}
	
	public int  randomTo7() {
		int num = 0;
		do {
			num = (randomTo5()-1)*5 + randomTo5() - 1;
		} while (num>20);
		return num%7 + 1;
	}

	public static void main(String[] args){
		
		int res = new Item63().randomTo7();
		System.out.println(res);
	}
}
