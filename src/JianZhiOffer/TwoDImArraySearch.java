package JianZhiOffer;

public class TwoDImArraySearch {
	public static boolean find(int[][] array,int target) {
		if(array == null) {
			return false;
		}
		int row = array.length -1;
		int col = 0;
		while((row>=0) && (col<array[0].length)) {
			if(target == array[row][col]) {
				return true;
			}
            
			if(target>array[row][col]) {
				col++;
			}else if(target<array[row][col]) {
				row--;
			}
        
		}
		return false;
	}

	
	public static void main(String[] args) {
		int[][] arr = {{1,2,4},{2,7,9}};
		int a = 9;
		boolean b = TwoDImArraySearch.find(arr, a);
		System.out.println(b);
	}
}




