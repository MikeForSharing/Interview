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

public class Item52 {
	
	public  void print(int[][] matrix) {
		int tr = 0;
		int tc = 0;
		int dr = 0;
		int dc = 0;
		int endR = matrix.length - 1;
		int endC = matrix[0].length - 1;
		boolean fromup = true;
		while (tr != endC +1) {
			printLine(matrix,tr,tc,dr,dc,fromup);
			tr = tc == endC ? tr + 1: tr;
			tc = tc == endC ? tc  : tc +1;
			dr = dr == endR ? dr: dr +1;
			dc = dr == endR ? dc +1: dc;
			fromup = !fromup;
		}
	}
	
	public void printLine(int[][] matrix, int tr, int tc, int dr, int dc, boolean b) {
		if(b) {
			while (tr != dr +1) {
				System.out.print(matrix[tr++][tc--] + " ");
			}
		}else {
			while (dr != tr - 1) {
				System.out.print(matrix[dr--][dc++] + " ");
			}
		}
	}


	public static void main(String[] args){
		int[][] arr = {{1,2},{4,5}};
		new Item52().print(arr);
//		
	}
}
