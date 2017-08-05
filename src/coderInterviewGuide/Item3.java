package coderInterviewGuide;

import java.util.Stack;

public class Item3 {
	private static Stack<Integer> stack = new Stack<Integer>();
	
	public void sortStackByStack(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			throw new RuntimeException("err");
		}
		Stack<Integer> help = new Stack<Integer>();
		while(!stack.isEmpty()) {
			int cur = stack.pop();
			while(!help.isEmpty() && cur>help.peek()) {
				stack.push(help.pop());
			}
			help.push(cur);
		}
//		System.out.println("help: " + help);

		while(!help.isEmpty()) {
			stack.push(help.pop());
		}
	}
	
	
	
	public static void main(String[] args) {
		Item3 test = new Item3();
		stack.push(4);
		stack.push(2);
		stack.push(3);
		stack.push(1);

//		System.out.println(stack);
		test.sortStackByStack(stack);
		System.out.println(stack);

//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());

	}
	
}
