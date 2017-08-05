package JianZhiOffer;

public class IQ40 {

	public void FindNumsAppearOnce(int[] array, int[] num1, int[] num2) {
		if(array.length<2) {
			num1 = num2 = null;
		}
		int tmp = 0;
		for(int i:array) {
			tmp ^= i;
		}
		int index = 0;
		index = findFirstBitIs1(tmp);
		int number1 = 0;
		int number2 = 0;
		
		for(int j:array) {
			if(isBit1(j, index)) {
				number1 ^= j;
			}else {
				number2 ^= j;
			}
		}
		num1[0] = number1;
		num2[0] = number2;
	}
	
	private boolean isBit1(int j,int index) {
		j = j >> index;
		return (j&1) == 0;
	}

	private int findFirstBitIs1(int number) {
		int index = 0;
		while((number&1) ==0) {
			number = number>>1;
			index++;
		}
		return index;
	}
	public static void main(String[] args) throws Exception {
		int[] arr = {1,2,2,3,4,3};
		int[] n1 ={0};
		int[] n2 = {0};
		new IQ40().FindNumsAppearOnce(arr, n1, n2);
		System.out.println(n1[0] + " " + n2[0]);
	}
	
	
 
	
}
