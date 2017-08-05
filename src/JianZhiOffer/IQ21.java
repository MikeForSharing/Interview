package JianZhiOffer;

import java.util.Stack;

import JianZhiOffer.IQ5.ListNode;

public class IQ21 {
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> stackMin = new Stack<Integer>();
	
	
	public void push(int node) {
		stack.push(node);
		if(stackMin.size() ==0) {
			stackMin.push(node);
		}else {
			int stackMinNode = stackMin.peek();
			if(node<stackMinNode) {
				stackMin.push(node);
			}else {
				stackMin.push(stackMinNode);
			}
		}
		
	}
	
	public void pop() {
		stackMin.pop();
		stack.pop();
	}
	
	public int top() {
		return stack.peek();
	}
	
	public int min() {
		return stackMin.peek();
	}
	
	

}



