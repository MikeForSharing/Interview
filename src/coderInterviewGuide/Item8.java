package coderInterviewGuide;


public class Item8 {
	
	public static Node removeMidNode(Node head) {
		if(head == null || head.next==null) {
			return head;
		}
		if(head.next.next==null) {
			return head.next;
		}
		Node pre = head;
		Node cur = head.next.next;
		while(cur.next != null && cur.next.next != null) {
			pre = pre.next;
			cur = cur.next.next;
		}
		pre.next = pre.next.next;
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
		
	
		Node tmp = Item8.removeMidNode(head1);
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


