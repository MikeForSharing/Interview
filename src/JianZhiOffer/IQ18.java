package JianZhiOffer;

import JianZhiOffer.IQ5.ListNode;

public class IQ18 {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean result = false;
		if(root1!=null&&root2!=null) {
			if(root1.val == root2.val) {
				result = doesHasSubtree(root1,root2);
			}
			if(!result) {
				HasSubtree(root1.leftNode,root2.leftNode);
			}
			if(!result) {
				HasSubtree(root1.right,root1.right);
			}
		}
		return result;
	}
		
	
	private boolean doesHasSubtree(TreeNode root1, TreeNode root2) {
		if(root2 ==null) {
			return true;
		}
		if(root1==null) {
			return false;
		}
		if(root1.val != root2.val) {
			return false;
		}
		return doesHasSubtree(root1.leftNode,root2.leftNode) && doesHasSubtree(root1.right,root2.right);
	}


	public static void main(String[] args) throws Exception {
		TreeNode root1 = new TreeNode(1);
		TreeNode root1Left = new TreeNode(2);
		TreeNode root1Right = new TreeNode(3);
		root1.leftNode = root1Left;
		root1.right = root1Right;
		
		TreeNode root2 = new TreeNode(1);
		TreeNode root2Left = new TreeNode(2);
		TreeNode root2Right = new TreeNode(3);
		root2.leftNode = root2Left;
		root2.right = root2Right;
		IQ18 test = new IQ18();
		boolean b = test.HasSubtree(root1, root2);
		System.out.println(b);
		
		
		
		
	}
	static class TreeNode{
		int val=0;
		TreeNode left = null;
		TreeNode right = null;
		
		TreeNode(int val) {
			this.val = val;
		}
	}
}



