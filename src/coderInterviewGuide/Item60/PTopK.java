package src.coderInterviewGuide.Item60;


public class PTopK {
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6}};
		new PTopK().pirntTopK(matrix, 2);
	}
	
	public void  pirntTopK(int[][] matrix,int k) {
		int heapSize = matrix.length;
		HeapNode[] heap = new HeapNode[heapSize]; 
		for (int i = 0; i < heapSize; i++) {
			int index = matrix[i].length - 1;
			heap[i] = new HeapNode(matrix[i][index],i,index);
			heapInsert(heap,i);
		}
		
		System.out.println("TOP" + k);
		
		for (int i = 0; i < k; i++) {
			if (heapSize==0) {
				break;
			}
			System.out.println(heap[0].value);
			if (heap[0].index!=0) {
				heap[0].value = matrix[heap[0].arrNum][--heap[0].index];
			}else {
				swap(heap,0,--heapSize);
			}
			heapify(heap,0,heapSize);
		}
	}

	private void heapify(HeapNode[] heap, int index, int heapSize) {
		int left = 2*index + 1;
		int right = 2*index + 2;
		
		int largest = index;
		while (left<heapSize) {
			if (heap[left].value>heap[index].value) {
				largest = left;
			}
			if (right<heapSize&&(heap[right].value>heap[largest].value)) {
				largest = right;
			}
			if (index != largest) {
				swap(heap, index, largest);
			}else {
				break;
			}
			index = largest;
			left = 2*index - 1;
			right = 2*right + 1;
		}
	}

	private void heapInsert(HeapNode[] heap, int index) {
		while(index!=0) {
			int parent = (index-1)/2;
			if (heap[parent].value <heap[index].value) {
				swap(heap, index, parent);
				index = parent;
			}else {
				break;
			}
			
		}
	}

	private void swap(HeapNode[] heap, int i, int j) {
		HeapNode tmp = heap[i];
		heap[i] = heap[j];
		heap[j] = tmp;
	}
	
}
