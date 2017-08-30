package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import com.sun.corba.se.pept.transport.ContactInfo;
import com.sun.org.apache.bcel.internal.generic.DCMPG;
import com.sun.org.apache.regexp.internal.recompile;

public class Item50 {
	
	public static void spiralPrintMatrix(int[][] matrix) {
		if (matrix == null) {
			return;
		}
		int tr = 0;
		int tc = 0;
		int br = matrix.length-1;
		int bc = matrix[0].length-1;
		
		while (tr<=br&&tc<=bc) {
			printEdge(matrix,tr++,tc++,br--,bc--);
		}
		
	}
	
	
	
	
	private static void printEdge(int[][] matrix, int tr, int tc, int br, int bc) {
		
		//只有一行
		if(tr==br) {
			for (int i = tc;  i<=bc; i++) {
				System.out.print(matrix[tr][i] + " ");
			}
		}else if (tc==bc) { //只有一列
			for (int i = tr; i <=br; i++) {
				System.out.print(matrix[i][tc]);
			}
		}else {
			int curR = tr;
			int curC = tc;
			
			while (curC!=bc) {
				System.out.print(matrix[tr][curC] + " ");
				curC++;
			}
			while (curR!=br) {
				System.out.print(matrix[curR][bc] + " ");
				curR++;
			}
			while (curC!=tc) {
				System.out.print(matrix[br][curC] + " ");
				curC--;
			}
			while (curR!=tr) {
				System.out.print(matrix[curR][tc] + " ");
				curR--;
			}
		}
		
	}




	public static void main(String[] args){
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		new Item50().spiralPrintMatrix(arr);
	}
}
