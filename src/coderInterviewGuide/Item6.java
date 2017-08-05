package coderInterviewGuide;

import java.util.LinkedList;

public class Item6 {
	
	public static void printCommonPart(Node head1, Node head2) {
		if(head1 == null || head2==null) {
			System.out.println("链表为空");
		}
		while(head1!=null && head2 !=null) {
			if(head1.value > head2.value) {
				head1 = head1.next;
			}
			if(head1.value < head2.value) {
				head2 = head2.next;
			}
			if(head1.value == head2.value) {
				System.out.print(head1.value + " ");
				head1 = head1.next;
				head2 = head2.next;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Node head1 = new Node(5);
		Node head12 = new Node(4);
		head1.next = head12;
		Node head13 = new Node(3);
		head12.next = head13;
		Node head14 = new Node(2);
		head13.next = head14;
		Node head15 = new Node(1);
		head14.next = head15;

		
		Node head2 = new Node(3);
		Node head22 = new Node(2);
		head2.next = head22;
		Node head23 = new Node(1);
		head22.next = head23;
		
		Item6.printCommonPart(head1, head2);
		
	}

	static class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
}


