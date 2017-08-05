package coderInterviewGuide;

import java.util.Stack;

public class Item1 {
	private Stack<Integer> stackData = new Stack<Integer>();
	private Stack<Integer> stackMin = new Stack<Integer>();
	
	
	public void push(int num) {
		stackData.push(num);
		if(stackMin.size() ==0) {
			stackMin.push(num);
		}else {
			if(num<=stackMin.peek()) {
				stackMin.push(num);
			}
		}
	}
	
	public int pop() {
		if(stackData.isEmpty()) {
			throw new RuntimeException("the stack is empty");
		}
		if(stackData.peek() == stackMin.peek()) {
			stackMin.pop();
		}
		return stackData.pop();
	}
	
	
	public int getMin() {
		if(stackMin.isEmpty()) {
			throw new RuntimeException("the stack is empty");
		}
		return stackMin.peek();
	}
	
	public static void main(String[] args) {
		Item1 test = new Item1();
		test.push(2);
		test.push(3);
		test.push(1);
		test.push(4);
		int min = test.getMin();
		System.out.println(min);
	}
	
}
