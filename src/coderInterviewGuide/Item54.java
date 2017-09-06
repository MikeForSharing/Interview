package src.coderInterviewGuide;


public class Item54 {
	
	public  boolean findK(int[][] matrix, int k) {
		int row = 0;
		int colum = matrix[0].length - 1;
		
		while (row<matrix.length&&colum>-1) {
			if (matrix[row][colum] == k) {
				return true; 
			}
			
			if (k<matrix[row][colum]) {
				colum--;
			}
			if (k>matrix[row][colum]) {
				row++;
			}
		}
		return false;
	}
	

	public static void main(String[] args){
		int[][] arr = {{1,2},{3,4},{5,6}};
		boolean res = new Item54().findK(arr, 9);
		System.out.println(res);
	}
}
