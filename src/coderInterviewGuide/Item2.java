package coderInterviewGuide;

import java.util.Stack;

public class Item2 {
	private static Stack<Integer> stack = new Stack<Integer>();
	
	public int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop();
		if(stack.isEmpty()) {
			return result;
		}else {
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	
	public void reverse(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		}
		int i = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}
	
	public static void main(String[] args) {
		Item2 test = new Item2();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		test.reverse(stack);
		System.out.println(stack);
		int result = test.getAndRemoveLastElement(stack);
	}
	
}
