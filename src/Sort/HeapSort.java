package src.Sort;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class HeapSort {

	public void heapSort(int[] num) {
		
		int len = num.length;

		//构建大顶堆
		for (int i=len/2-1;i>=0;i--) {
			adjustHeap(num,i,len);
		}
		
		//排序
		for (int j = len-1; j >=0; j--) {
			swap(num, 0, j);
			adjustHeap(num, 0, j-1);
		}
		
	}
	
	
	private void adjustHeap(int[] num, int i, int len) {
		for (int s=i; s < len;) {
			int max = s;
			if (2*s+1<len && num[2*s+1]>num[max]) {
				max = 2*s +1;
			}
			if (2*s+2<len && num[2*s+2]>num[max]) {
				max = 2*s + 2;
			}
			if (max!=s) {
				swap(num,max,s);
				s = max;
			}else {
				break;
			}
		}
		
	}


	private void swap(int[] num, int i, int j) {
		int tmp = num[i];
		num[i] = num[j];
		num[j] = tmp;
	}


	public static void main(String[] args) {
		int[] num = {1,3,2,5,4,8,6};
		new HeapSort().heapSort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
