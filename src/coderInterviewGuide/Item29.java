package coderInterviewGuide;

import java.util.Stack;

public class Item29 {
	
	public Node reverseSin(Node head) {
		Node next;
		Node pre = null;
		while(head !=null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
	
	
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next = n2;
		n2.next = n3;
		Node newHead = new Item29().reverseSin(n1);
		System.out.println(newHead.next.next.value);
		
		
	}
	static class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
}


