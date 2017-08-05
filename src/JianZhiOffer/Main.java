package JianZhiOffer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	
    
    public static void main(String[] args) {
        while(true) {
        	System.out.println("hello");
        }
    }
    static  int findThives(int n,String queue) {
    	int thivesNum = 0;
    	if(n == 0 || queue.equals("")) {
    		return 0;
    	}
    	char[] cArr = new char[queue.toCharArray().length];
    	cArr = queue.toCharArray();
    	int check = cArr.length;
    	if(n != check) {
    		return -1;
    	}
    	
    	for(int i=0;i<cArr.length;i++) {
    		if(Character.isDigit(cArr[i])) {
    			int tmp = Character.getNumericValue(cArr[i]);
    			for(int j=i+1;(j<=i+tmp)&&((i+tmp)<check);j++) {
    				if(cArr[j] == 'X') {
    					thivesNum++;
    				}
    			}
    			if(i>=tmp &&i>=1 &&tmp >=1) {
    				for(int k=i-tmp;k<=i-1;k++) {
    					System.out.println(cArr[k]);
        				if(cArr[k] == 'X') {
        					thivesNum++;
        				}
        			}
    			}
    			
    		}
    	}
    	return thivesNum;
    	
    }

}
