package coderInterviewGuide;

import java.util.Stack;

public class Item9 {
	//递归
	//前序遍历
	public static void preOrderRecur(Node head) {
		if(head==null) {
			return;
		}
		System.out.print(head.value + " ");
		preOrderRecur(head.left);
		preOrderRecur(head.right);
	}
	//中序遍历
	public static void inOrderRecur(Node head) {
		if(head==null) {
			return;
		}
		preOrderRecur(head.left);
		System.out.print(head.value + " ");
		preOrderRecur(head.right);
	}
	//后序遍历
	public static void posOrderRecur(Node head) {
		if(head==null) {
			return;
		}
		preOrderRecur(head.left);
		preOrderRecur(head.right);
		System.out.print(head.value + " ");
	}
	
	//非递归
	//前序遍历
	public void preInOrderUnRecur(Node head) {
		if(head!=null) {
			Stack<Node> stack = new Stack<Node>();
			stack.push(head);
			while (!stack.isEmpty()) {
				head = stack.pop();
				System.out.print(head.value + " ");
				if(head.right!=null)
					stack.push(head.right);
				if(head.left!=null)
					stack.push(head.left);
			}
			System.out.println();
		}
	}
	
	//中序遍历
	public void inOrderUnRecur(Node head) {
		if(head!=null) {
			Stack<Node> stack = new Stack<Node>();
			while(!stack.isEmpty() || head!=null) {
				if(head!=null) {
					stack.push(head);
					head = head.left;
				}else {
					head = stack.pop();
					System.out.println(head.value + " ");
					head = head.right;
				}
			}
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		
		
		
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


