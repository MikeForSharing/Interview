package JianZhiOffer;

import JianZhiOffer.IQ18.TreeNode;

public class IQ27 {
	public TreeNode Convert(TreeNode pRootOfTree) {
		TreeNode lastNodeList = null;
		TreeNode headList = ConvertNode(pRootOfTree,lastNodeList);
		while(headList!=null&&headList.left!=null) {
			headList = headList.left;
		}
		return headList;
	}

	public TreeNode ConvertNode(TreeNode root, TreeNode lastNodeList) {
		if(root==null) {
			return null;
		}
		TreeNode current = root;
		if(current.left!=null) {
			lastNodeList = ConvertNode(current.left,lastNodeList); 
		}

		current.left = lastNodeList;
		if(lastNodeList!=null) {
			lastNodeList.right = current;
		}
		lastNodeList = current;

		if(current.right!=null) {
			lastNodeList = ConvertNode(current.right,lastNodeList);
		}
		return lastNodeList;
	}
	public static void main(String[] args) throws Exception {
		TreeNode root = new TreeNode(10);
		TreeNode left = new TreeNode(6);
		TreeNode right = new TreeNode(14);
		TreeNode leftleft = new TreeNode(4);
		TreeNode leftright = new TreeNode(8);
		
		root.left = left;
		root.right = right;
		left.left = leftleft;
		left.right = leftright;
		IQ27 iq = new IQ27();
		TreeNode listHead = null;
		listHead = iq.Convert(root);
		System.out.println(listHead.val);
		System.out.println(listHead.right.val);
		System.out.println(listHead.right.right.val);

	}

}



