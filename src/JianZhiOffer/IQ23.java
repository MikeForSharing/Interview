package JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class IQ23 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>(); 
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root == null) {
			return list;
		}
		
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode node = queue.poll();
			list.add(node.val);
			
			if(node.left !=null) {
				queue.add(node.left);
			}
			if(node.right !=null) {
				queue.add(node.right);
			}
		}
		return list;
	}
	
	
	public static void main(String[] args) throws Exception {
		TreeNode root = new TreeNode(1);
//		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
//		TreeNode node3 = new TreeNode(4);
//		TreeNode node4 = new TreeNode(5);
//		TreeNode node5 = new TreeNode(6);
//		TreeNode node6 = new TreeNode(7);

//		root.left = node1;
		root.right = node2;
//		node1.left = node3;
//		node1.right = node4;
		
		
		
		IQ23 test = new IQ23();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = test.PrintFromTopToBottom(root);
		System.out.println(list);
	}

}



