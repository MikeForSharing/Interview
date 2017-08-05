package JianZhiOffer;

public class IQ39 {

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
		int result = new IQ39().GetNumberOfK(arr, 2);
		System.out.println(result);
	}
	
	
 
	
}
