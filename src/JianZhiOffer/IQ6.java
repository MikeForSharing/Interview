package JianZhiOffer;

import java.util.Arrays;

public class IQ6 {
	
	     public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	    	 TreeNode root = null;
		   for(int i=0;i<in.length;i++) {
			   if(in[i] == pre[0]) {
				   root = new TreeNode(pre[0]);

				   System.out.print(root.val);
				   root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1, i+1),
						   Arrays.copyOfRange(in, 0, i));
				   root.right=reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length)
						   ,Arrays.copyOfRange(in, i+1, in.length));

			   }
		   }  
		   return root;
		   
		 }
		
		public static void main(String[] args) {
			int[] pre = {1,2,4,7,3,5,6,8};
			int[] in = {4,7,2,1,5,3,6,8};
			IQ6.reConstructBinaryTree(pre, in);
			
			
		}
		
	}


	class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }














