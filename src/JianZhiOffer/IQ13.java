package JianZhiOffer;


public class IQ13 {
	public void delete(ListNode listHead,ListNode toBeDeleted) {
		if(listHead == null || toBeDeleted == null) {
			return;
		}
		//如果链表只有一个结点
		if(listHead == toBeDeleted) {
			listHead = null;
			listHead.nextPoint = null;
		}
		
		//删除的是链表的尾结点
		if(toBeDeleted.nextPoint == null) {
			ListNode tmpNode = listHead.nextPoint;
			while(tmpNode != toBeDeleted) {
				tmpNode = tmpNode.nextPoint;
			}
		}else {  //删除的不是链表的尾结点
			toBeDeleted.val = toBeDeleted.nextPoint.val;
			toBeDeleted.nextPoint = toBeDeleted.nextPoint.nextPoint;
		}
    }	
	
	public static void main(String[] args) throws Exception {
		ListNode head = new ListNode();
		ListNode sec = new ListNode();
		ListNode third = new ListNode();
		head.val = 1;
		head.nextPoint = sec;
		sec.val = 2;
		sec.nextPoint = third;
		third.val = 3;
		third.nextPoint = null;
		
		IQ13 q = new IQ13();
		q.delete(head, sec);
		
		
		
	}
	
	static class ListNode{
		int val;
		ListNode nextPoint;
	}
		
}

















