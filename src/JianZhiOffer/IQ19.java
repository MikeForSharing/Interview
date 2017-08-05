package JianZhiOffer;

import JianZhiOffer.IQ5.ListNode;

public class IQ19 {
	public void Mirror(TreeNode root) {
		if(root==null||(root.left==null&&root.right==null)) {
			return;
		}
		
		TreeNode tmpNode;
		tmpNode = root.left;

		root.left = root.right;
		root.right = tmpNode;
		

		if(root.left != null) {
			Mirror(root.left);
		}
		if(root.right != null) {
			Mirror(root.right);

		}

	}
		
	
	


	public static void main(String[] args) throws Exception {
		TreeNode root1 = new TreeNode(1);
		TreeNode root1Left = new TreeNode(2);
		TreeNode root1Right = new TreeNode(3);
		root1.left = root1Left;
		root1.right = root1Right;
		
		
		IQ19 test = new IQ19();
		TreeNode root = test.Mirror(root1);
		System.out.println(root.val+ " " + root.left.val + " " + root.right.val);

		
		
		
	}
	static class TreeNode{
		int val=0;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val) {
			this.val = val;
		}
	}
}



