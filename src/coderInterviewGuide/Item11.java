package coderInterviewGuide;

import java.util.Stack;

public class Item11 {
	
	public boolean huiwen(Node head) {
		if(head==null||head.next==null) {
			return true;
		}
		
		Node cur = head;
		Node right = head.next;
		while(cur.next!=null && cur.next.next!=null) {
			right = right.next;
			cur = cur.next.next;
		}
		
		Stack<Node> stack = new Stack<Node>();
		while(right!=null) {
			stack.push(right);
			right = right.next;
		}
		
		while(!stack.isEmpty()) {
			if(stack.pop().value != head.value) {
				return false;
			}else{
				head = head.next;
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(2);
		Node n4 = new Node(1);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		boolean newHead = new Item11().huiwen(n1);
		System.out.println(newHead);
		
		
	}
	static class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
}


