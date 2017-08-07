package src.coderInterviewGuide;

public class Item35 {
	public static int jump(int[] arr) {
		int cur = 0;
		int next = 0;
		int jump = 0;
		for(int i=0;i<arr.length;i++) {
			if(cur<i) {
				jump++;
				cur = next;
			}
			next = Math.max(next, i+arr[i]);
		}
		return jump;
	}
	
	
	public static void main(String[] args){
		int[] arr = {3,2,3,1,1,4};
		int res = Item35.jump(arr);
		System.out.println(res);
	}
}
