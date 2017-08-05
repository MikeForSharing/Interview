package JianZhiOffer;

import java.util.Stack;

import JianZhiOffer.IQ5.ListNode;

public class IQ22 {
	Stack<Integer> stack = new Stack<Integer>();
	public boolean IsPopOrder(int[] pushA,int[] popA) {
		int j=0;
		int i=0;
		while(i<popA.length){
			while(j<pushA.length) {
				if(pushA[j] == popA[i]) {
					stack.push(pushA[j]);
					j++;
					break;
				}else{
					stack.push(pushA[j]);
					j++;
				}
			}
			if(stack.peek() == popA[i]) {
				stack.pop();
				i++;
			}else if(j>=pushA.length){
				break;
			}
		}
		if(i==popA.length && j==pushA.length) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) throws Exception {
		int[] a = {1,2,3};
		int[] b = {3,2,1};
		
		IQ22 test = new IQ22();
		boolean root = test.IsPopOrder(a, b);
		System.out.println(root);
	}

}



