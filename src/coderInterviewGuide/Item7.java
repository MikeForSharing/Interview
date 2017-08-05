package coderInterviewGuide;

import java.util.LinkedList;

import coderInterviewGuide.Item6.Node;

public class Item7 {
	public static int getListSize(Node head) {
		int length = 0;
		while(head!=null) {
			length++;
			head = head.next;
		}
		return length;
	}	
	public static Node removeLastKthNode(Node head, int lastKth) {
		int Kth = getListSize(head) - lastKth + 1;
		Node tmpNode = head;
		for(int i=0;i!=Kth-2;i++) {
			tmpNode = tmpNode.next;
		}
		tmpNode.next = tmpNode.next.next;
		return head;
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
		
	
		Node tmp = Item7.removeLastKthNode(head1, 2);
		while(tmp !=null) {
			System.out.print(tmp.value + " ");
			tmp = tmp.next;
		}
		
	}
	static class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
}


