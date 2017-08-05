package Sort;

import java.util.Arrays;

public class InsertSort {
	
	public static int[] sort(int[] a) {  
		int target;
		int j;
		int k;
        for(int i=1;i<a.length;i++) {
        	target = a[i];
        	j = i;
        	while(j>0&&target<a[j-1]) {
        		a[j] = a[j-1];
        		a[j-1] = target;
        		j--;
        		
        	}
        }
        return a;
        
    }  
  
 
      
    // 归并排序的实现  
    public static void main(String[] args) {  
  
        int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };  
  
        InsertSort.sort(nums);  
        System.out.println(Arrays.toString(nums));  
    }  

}
