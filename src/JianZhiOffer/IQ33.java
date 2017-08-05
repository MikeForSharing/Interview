package JianZhiOffer;

import java.util.ArrayList;

public class IQ33 {

	private void printMinNumber(int[] array, int start, int end) {
		if(start<end){
			int main_number=array[end];
			int small_cur=start;
			for(int j=start;j<end;j++){
				if(isSmall(String.valueOf(array[j]),String.valueOf(main_number))){
					int temp=array[j];
					array[j]=array[small_cur];
					array[small_cur]=temp;
					small_cur++;
				}
			}
			array[end]=array[small_cur];
			array[small_cur]=main_number;
			printMinNumber(array, 0, small_cur-1);
			printMinNumber(array, small_cur+1, end);
		}
	}

	public boolean isSmall(String m, String n) {
		String left = m + n;
		String right = n + m;
		for(int i=0;i<left.length();i++) {
			if(left.charAt(i)<right.charAt(i)) {
				return true;
			}else if(left.charAt(i)>right.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		int result = new IQ33().NumberOfBetween1AndN_Solution(13);
		System.out.println(result);

	}

}
