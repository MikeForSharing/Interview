package JianZhiOffer;


import java.util.LinkedHashMap;


public class IQ37 {

	private ListNode FindFirstCommonNode(ListNode pHead1,ListNode pHead2) {
		if(pHead1 ==null || pHead2 == null) {
			return null;
		}
		int p1Length = GetListNodeLength(pHead1);
		int p2Length = GetListNodeLength(pHead2);
		
		int diff = p1Length - p2Length;
		
		ListNode pHeadLong = pHead1;
		ListNode pHeadShort = pHead2;
		
		if(p1Length < p2Length) {
			diff = p2Length - p1Length;
			pHeadLong = pHead2;
			pHeadShort = pHead1;
		}
		
		//在较长链表上先移动几步
		for(int i=0;i<diff;i++) {
			pHeadLong = pHeadLong.next;
		}
		
		while(pHeadLong != null && pHeadShort != null && pHeadLong != pHeadShort) {
			pHeadLong = pHeadLong.next;
			pHeadShort = pHeadShort.next;
		}
		
		ListNode commonNode = pHeadLong;
		return commonNode;
	}
	
	public int GetListNodeLength(ListNode pHead) {
		int length = 0;
		while(pHead.next != null) {
			pHead = pHead.next;
			length++;
		}
		return length;
	}
	
	public static void main(String[] args) throws Exception {
		int result = new IQ37().FirstNotRepeatingChar(str);
		System.out.println(result);
	}
	
	class ListNode {
		int val;
		ListNode next = null;
		
		ListNode(int val) {
			this.val = val;
		}
	}

}
