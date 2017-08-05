package coderInterviewGuide;

import java.util.LinkedList;

public class Item5 {
	
	public int[] getMaxWindow(int[] arr, int w) {
		LinkedList<Integer> qmax = new LinkedList<Integer>();
		int[] result = new int[arr.length - w + 1];
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			while(!qmax.isEmpty() && (arr[qmax.peekLast()] <=arr[i])) {
				qmax.pollLast();
			}
			qmax.addLast(i);
			if(qmax.peekFirst() == i-w) {
				qmax.pollFirst();
			}
			if(i>=w-1) {
				result[index++] = arr[qmax.peekFirst()];
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {4,3,5,4,3,3,6,7};
		Item5 test = new Item5();
		int[] res = test.getMaxWindow(arr, 3);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();


	}
	
}
