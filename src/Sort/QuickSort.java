package src.Sort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,3,5,4};
		new QuickSort().sort(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void sort(int[] arr,int start,int end) {
		int mid;
		if (start<end) {
			mid = partition(arr,start,end);
			sort(arr, start, mid-1);
			sort(arr, mid+1, end);
		}

	}
	public int partition(int[] arr,int low, int high) {
		int tmp = arr[low];
		while (low<high) {
			while(low<high&&arr[high] >= tmp) {
				high--;
			}
			arr[low] = arr[high];
			while (low<high&&arr[low]<=tmp) {
				low++;
			}
			arr[high] = arr[low];
		}
		arr[low] = tmp;
		return low;
	}
}
