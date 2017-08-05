package JianZhiOffer;

import java.util.LinkedList;

public class IQ45 {
	static LinkedList<Integer> numbers = new LinkedList<Integer>();
	public int LastRemaining_Solution(int n, int m) {
		if(n<1||m<1) {
			return -1;
		}
		int current = 0;
		while(numbers.size() > 1) {
			for(int i=1;i<m;i++) {
				current++;
				if(current > numbers.size()-1){
					current = 0;
				}
			}
			int next = current + 1;
			if(next > numbers.size()-1) {
				next = 0;
			}
			numbers.remove(current);
			if(next == 0) {
				current = next;
			}else {
				current = next-1;
			}
		}
		return numbers.get(current);
	}
		
	public static void main(String[] args) {
		numbers.add(0);numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(4);
		IQ45 test = new IQ45();
		int result = test.LastRemaining_Solution(5, 3);
		System.out.println(result);
	}

}
