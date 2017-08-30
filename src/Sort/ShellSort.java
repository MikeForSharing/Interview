package src.Sort;

import java.util.Arrays;

public class ShellSort {

	public void sort(int[] arr) {
		int increment = arr.length/2;
		while (increment>=1) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = increment; j < arr.length-increment; j++) {
					int tmp = arr[j];
					if (arr[j]>arr[j+increment]) {
						tmp = arr[j];
						arr[j] = arr[j+increment];
						arr[j+increment] = tmp;
					}
				}
			}
			increment /= 2;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,2,5,8,6};
		new ShellSort().sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
