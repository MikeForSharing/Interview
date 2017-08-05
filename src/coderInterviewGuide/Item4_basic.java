package coderInterviewGuide;

import java.util.Stack;

public class Item4_basic {
	
	public void hanno(int n, char from, char mid, char to) {
		if(n == 1) {
			System.out.println("disk 1" + " move " + from + " to " + to);
		}else {
			hanno(n-1,from,to,mid);
			System.out.println("disk " + n + " move " + from + " to " + to);
			hanno(n-1,mid,from,to);
		}
	}
	
	
	
	public static void main(String[] args) {
		Item4_basic item = new Item4_basic();
		item.hanno(28, 'A', 'B', 'C');

	}
	
}
