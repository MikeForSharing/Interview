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

public class Item51 {
	
	public static void rotate(int[][] matrix) {
		if (matrix == null) {
			return;
		}
		int tr = 0;
		int tc = 0;
		int br = matrix.length-1;
		int bc = matrix[0].length-1;
		
		while (tr<=br) {
			rotateEdge(matrix,tr++,tc++,br--,bc--);
		}
		
	}
	
	
	
	
	private static void rotateEdge(int[][] matrix, int tr, int tc, int br, int bc) {
		int num = br - tr;
		int tmp =0;
		for (int i = 0; i <num; i++) {
			tmp = matrix[tr][tc+i];
			matrix[tr][tc+i] = matrix[br-i][tc];
			matrix[br-i][tc] = matrix[br][bc-i];
			matrix[br][bc-i] = matrix[tr+i][bc];
			matrix[tr+i][bc] = tmp;
		}
	}


	public static void main(String[] args){
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		new Item51().rotate(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+ " ");

			}
			System.out.println();

		}
	}
}
