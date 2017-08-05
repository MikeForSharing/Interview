package JianZhiOffer;


public class IQ8 {
	
	public int minNumberInRotateArray(int [] array) {
	  int leftIndex = 0;
	  int rightIndex = array.length - 1;
	  int mid = 0;
	  while(array[leftIndex] >= array[rightIndex]) {
		  if(rightIndex-leftIndex <= 1) {
			  mid = rightIndex;
			  break;
		  }
		  mid = (leftIndex + rightIndex)/2;
		  if(array[leftIndex] == array[rightIndex] && array[mid] == array[leftIndex]) {
			  if(array[leftIndex+1]!= array[rightIndex-1]) {
				  mid = array[leftIndex] > array[rightIndex] ? leftIndex + 1:rightIndex -1;
				  break;
			  }else{
				  leftIndex++;
				  rightIndex--;
			  }
		  }else{
			  if(array[leftIndex] <= array[mid]) {
				leftIndex = mid;
			  }else{
				  if(array[rightIndex] >= array[mid]) {
					  rightIndex = mid;
				  }
			  }
		  }
	  }
	  return mid;
	  
    }
		
	public static void main(String[] args) {
		IQ8 q = new IQ8();
		int[] arr1 = {3,4,5,1,2};
		int[] arr2 = {1,1,1,0,1};
		int[] arr3 = {1,1,1,1,0};
		int index = q.minNumberInRotateArray(arr3);
		System.out.println(index);
		
		
	}
		
}

















