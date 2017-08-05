package JianZhiOffer;

public class IQ39_2 {

	public boolean IsBalanced_Solution(TreeNode root) {
		if(root==null) {
			return true;
		}
		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		int dif = left - right;
		if(dif>1 || dif<-1) {
			return false;
		}else {
			return true;
		}
	}
	
	public int TreeDepth(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		return left > right ? left+1 : right+1;
	}
	
	
	public static void main(String[] args) throws Exception {
		int[] arr = {1,2,2,2,3};
		int result = new IQ39_2().GetNumberOfK(arr, 2);
		System.out.println(result);
	}
	
	
 
	
}
