package coderInterviewGuide;

import java.util.Stack;

public class Item10 {
	
	public Node josephusCircle(Node head, int m) {
		if(head==null||head.next==head||m<1) {
			return head;
		}
		
		Node last = head;
		while(last.next != head) {
			last = last.next;
		}
		int count=0;
		while(head != last) {
			if(++count==m) {
				last.next = head.next;
				count = 0;
			}else{
				last = last.next;
			}
			head = last.next;
		}
		return head;
	}
	
	
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n1;

		Node newHead = new Item10().josephusCircle(n1, 4);
		System.out.println(newHead.value);
		
		
	}
	static class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
}


