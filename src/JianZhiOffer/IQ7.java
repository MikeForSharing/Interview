package JianZhiOffer;

import java.util.Stack;

public class IQ7 {
	
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	if(stack2.isEmpty()) {
    		while(!stack1.isEmpty()) {
    			stack2.push(stack1.pop());
    		}
    	}
    	
    	if(stack2.isEmpty()) {
    		System.out.println("the quene is empty!");
    	}
    	return stack2.pop();
    }
		
	public static void main(String[] args) {
		IQ7 q = new IQ7();
		q.push(1);
		q.push(2);
		q.pop();
		
		
	}
		
}

















