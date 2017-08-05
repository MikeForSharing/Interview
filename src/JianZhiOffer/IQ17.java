package JianZhiOffer;

import JianZhiOffer.IQ5.ListNode;

public class IQ17 {
	public ListNode merge(ListNode list1,ListNode list2) {
		ListNode mergeHead = null;
		if(list1 == null) {
			return list2;
		}
		if(list2 == null) {
			return list1;
		}
		if(list1==null&&list2==null) {
			return null;
		}
		
		if(list1.val > list2.val) {
			mergeHead = list2;
			mergeHead.next = merge(list1,list2.next);
		}else{
			mergeHead = list1;
			mergeHead.next = merge(list1.next,list2);
		}
		return mergeHead;
		
		
		
		
	}
		
	
	public static void main(String[] args) throws Exception {
		ListNode head1 = new ListNode(1);
		ListNode second1 = new ListNode(3);
	
		ListNode head2 = new ListNode(2);
		ListNode second2 = new ListNode(4);

		head1.next = second1;
		head2.next = second2;
		IQ17 test = new IQ17();
		ListNode ln = test.merge(head1, head2);
		System.out.println(ln.next.next.val);
		
		
		
		
	}
}


