package JianZhiOffer;

import JianZhiOffer.IQ5.ListNode;

public class IQ15 {
	public ListNode reverseList(ListNode head) {
		ListNode reversedListHead = null;
		ListNode pNode = head;
		ListNode pPre = null;
		ListNode pNext =null;
		while(pNode != null) {
			pNext = pNode.next;
			if(pNode.next == null) {
				 reversedListHead = pNode;
			}
			pNode.next = pPre;
			pPre = pNode;
			pNode = pNext;
		}
		return reversedListHead;
		
		
		
	}
		
	
	public static void main(String[] args) throws Exception {
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = null;
		IQ15 test = new IQ15();
		ListNode ln = test.reverseList(head);
		System.out.println(ln.val);
		
		
		
		
	}
}


