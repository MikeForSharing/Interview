package JianZhiOffer;

import java.util.LinkedList;

public class IQ47 {
	static LinkedList<Integer> numbers = new LinkedList<Integer>();
	public int add(int num1, int num2) {
		int sum,carry;
		do{
			sum = num1 ^ num2;
			carry = (num1&num2) <<1;
			
			num1 = sum;
			num2 = carry;
		}while (num2 != 0);
		return num1;
	}
		
	public static void main(String[] args) {
		IQ47 test = new IQ47();
		int result = test.add(21, 5);
		System.out.println(result);
	}

}
