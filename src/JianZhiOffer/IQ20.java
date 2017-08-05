package JianZhiOffer;

import java.util.ArrayList;

import JianZhiOffer.IQ5.ListNode;

public class IQ20 {
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(matrix == null) {
			return null;
		}
		
		int start = 0;
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		if(columns == 1) {
			for(int i=0;i<rows;i++) {
				result.add(matrix[i][0]);
			}
			return result;
		}
		
		while(start*2<rows && start*2<columns) {
			result = printFourStep(matrix,start,rows,columns,result);
			start++;
		}
		return result;
	}
		
	
	


	private ArrayList<Integer> printFourStep(int[][] matrix, int start, int rows, int columns,ArrayList<Integer> result) {
		int endX = columns - start -1;
		int endY = rows -start - 1;
		for(int i=start;i<=endX;i++) {
			result.add(matrix[start][i]);
		}
		
		if(start<endY) {
			for(int i=start+1;i<=endY;i++) {
				result.add(matrix[i][endX]);
			}
		}
		if(start<endX&&start<endY) {
			for(int i=endX-1;i>=start;i--) {
				result.add(matrix[endY][i]);
			}
		}
		if((start<endY-1) && start<endX) {
			for(int i=endY-1;i>=start+1;i--) {
				result.add(matrix[i][start]);
			}
		}
		return result;
	}


	public static void main(String[] args) throws Exception {
		int[][] a = {{1,2},{3,4},{5,6},{7,8},{9,10}};
		
		IQ20 test = new IQ20();
		ArrayList<Integer> root = test.printMatrix(a);
//		System.out.println(root.size());
	}

}



