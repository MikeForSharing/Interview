package JianZhiOffer;

import java.util.ArrayList;
import java.util.Stack;

public class IQ5 {
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Stack<ListNode> stack = new Stack<ListNode>();
		while(listNode != null) {
			stack.push(listNode);
			listNode = listNode.next;
		}
		while(!stack.empty()) {
			arrayList.add(stack.pop().val);
		}
		return arrayList;
	}
	
	static class ListNode{
		int val;
		ListNode next = null;		
		public ListNode(int val) {
			this.val = val;
		}
	}
	
	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		node1.next=node2;
		node2.next=node3;
		IQ5.printListFromTailToHead(node1);
		
	}
}













