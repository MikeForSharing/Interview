package JianZhiOffer;

import java.util.Arrays;

class RandomListNode{
	int label;
	RandomListNode next = null;
	RandomListNode random = null;
	
	RandomListNode(int label) {
		this.label = label;
	}
}

public class IQ26 {
	public RandomListNode clone(RandomListNode pHead) {
		RandomListNode result = null;
		cloneNodes(pHead);
		connectSiblingNodes(pHead);
		result = reConnectNodes(pHead);
		return result;
	}
	public void cloneNodes(RandomListNode pHead) {
		RandomListNode point = pHead;
		while(point != null) {
			RandomListNode copy = new RandomListNode(point.label);
			copy.next = point.next;
			copy.random = null;
			point.next = copy;
			point = copy.next;
		}
	}
	
	public void connectSiblingNodes(RandomListNode pHeadCopyed) {
		RandomListNode point = pHeadCopyed;
		while(point != null) {
			if(point.random != null) {
				point.next.random = point.random.next;
			}
			point = point.next.next;
		}
	}
	
	public RandomListNode reConnectNodes(RandomListNode pHead) {
		RandomListNode pNode = pHead;
		RandomListNode pClonedHead = null;
		RandomListNode pClonedNode = null;
		if(pNode !=null) {
			pClonedHead = pNode.next;
			pClonedNode = pNode.next;
			pNode.next = pClonedNode.next;
			pNode = pNode.next;
		}
		while(pNode != null) {
			pClonedNode.next = pNode.next;
			pClonedNode = pClonedNode.next;
			System.out.println(pClonedNode.next);
			pNode = pClonedNode.next;
			pNode = pNode.next;
		}
		return pClonedHead;
		
	}
	
	public static void main(String[] args) throws Exception {
		IQ26 iq = new IQ26();
		RandomListNode result = null;
		RandomListNode head = new RandomListNode(1);
		RandomListNode node1 = new RandomListNode(2);
		RandomListNode node2 = new RandomListNode(3);
		head.next = node1;
		node1.next = node2;
		node2.next = null;
		node2.random = null;
		head.random = node2;
		node1.random = null;
		result = iq.clone(head);
//		System.out.println(result);
	}

}



