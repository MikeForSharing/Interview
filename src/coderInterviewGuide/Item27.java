package coderInterviewGuide;

import java.util.Stack;

public class Item27 {
	
	
	
	public Node reverseDup(Node head) {
		Node pre = null;
		Node next = null;
		
		while(head !=null) {
			next = head.next;
			head.next = pre;
			head.last = next;
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
		Node newHead = new Item27().reverseSin(n1);
		System.out.println(newHead.next.next.value);
		
		
	}
	static class Node{
		private int value;
		private Node next;
		private Node last;
		
		public Node(int value) {
			this.value = value;
		}
	}
}


