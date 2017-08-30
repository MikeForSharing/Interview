package src.Sort;

public class BubbleSort {
	
	private static void bubble(int[] arr) {
		int pre,cur,tmp;
		for (int j = arr.length-1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (arr[i]>arr[i+1]) {
					tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		}
	
	}
	public static void main(String[] args) {
		int[] arr = {1,3,2,5,0,9};
		BubbleSort.bubble(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
