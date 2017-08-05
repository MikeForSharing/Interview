package coderInterviewGuide;

import java.util.Stack;

public class Item28 {
	
	public Node reversePart(Node head, int from, int to) {
		int len = 0;
		Node node1 = head;
		Node fPre = null;
		Node tPos = null;
		while(node1 != null) {
			len++;
			fPre = len == from -1 ? node1 : fPre;
			tPos = len == to + 1 ? node1 : tPos;
			node1 = node1.next;
		}
		if(from>=to || from<1 || to >len) {
			return head;
		}
		
		node1 = fPre == null ? head:fPre.next;
		Node node2 = node1.next;
		node1.next = tPos;
		Node next = null;
		
		
		while(node2 != tPos){
			next = node2.next;
			node2.next = node1;
			node1 = node2;
			node2 = next;
		}
		
		if(fPre != null) {
			fPre.next = node1;
			return head;
		}
		return node1;
	}
	
	
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		System.out.println(n1.next.value);

		Node newHead = new Item28().reversePart(n1, 1, 2);
		System.out.println(newHead.next.value);
		
		
	}
	static class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
}


