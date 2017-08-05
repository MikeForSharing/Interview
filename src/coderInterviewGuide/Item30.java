package coderInterviewGuide;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import coderInterviewGuide.Item29.Node;

public class Item30 {
	
	
	public String SerBPre(Node head) {
		if(head ==null) {
			return "#!";
		}
		String str = head.value + "!";
		str += SerBPre(head.left);
		str += SerBPre(head.right);
		return str;
	}
	
	
	
	public Node recoByPreStr(String preStr) {
		String[] values = preStr.split("!");		Queue<String> que = new LinkedList<String>();
		for(int i=0;i<values.length;i++) {
			que.offer(values[i]);
		}
		
		return recoByPreOrder(que);
		
	}
	
	
	
	private Node recoByPreOrder(Queue<String> que) {
		String value = que.poll();
		if(value.equals("#")) {
			return null;
		}
		Node head = new Node(Integer.valueOf(value));
		head.left = recoByPreOrder(que);
		head.right = recoByPreOrder(que);
		
		return null;
	}
	static class Node{
		private int value;
		private Node left;
		private Node right;
		
		public Node(int value) {
			this.value = value;
		}
	}
}
