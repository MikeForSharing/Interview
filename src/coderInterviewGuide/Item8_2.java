package coderInterviewGuide;


public class Item8_2 {
	
	public static Node removeNodeByRatio(Node head,int a, int b) {
		if(a<1 || a>b) {
			return head;
		}
		int n=0;
		Node cur = head;
		while(cur!=null) {
			n++;
			cur = cur.next;
		}
		n = (int)Math.ceil(((double)n*a/(double)b));
		if(n ==1) {
			return head.next;
		}
		if(n>1) {
			cur = head;
			while(--n != 1) {
				cur= cur.next;
			}
			cur.next = cur.next.next;
		}
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
		
	
		Node tmp = Item8_2.removeNodeByRatio(head1, 1, 5);
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


