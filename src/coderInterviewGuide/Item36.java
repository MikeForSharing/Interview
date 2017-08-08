package src.coderInterviewGuide;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Item36 {
	public static int longestConsective(int[] arr) {
		if(arr == null || arr.length ==0) {
			return 0;
		}
		int max = 0;
		Map<Integer, Integer> hmap = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!hmap.containsKey(arr[i])) {
				hmap.put(arr[i], 1);
				if (hmap.containsKey(arr[i]-1)) {
					max = Math.max(max, merge(hmap,arr[i]-1,arr[i]));
				}
				if (hmap.containsKey(arr[i] + 1)) {
					max = Math.max(max, merge(hmap, arr[i], arr[i]+1));
				}
			}
		}
		return max;
		
	}
	
	
	private static int merge(Map<Integer, Integer> hmap, int less, int more) {
		int left = less - hmap.get(less) + 1;
		int right = more + hmap.get(more) -1;
		int len = right - left + 1;
		hmap.put(left, len);
		hmap.put(right, len);
		return len;
	}


	public static void main(String[] args){
		int[] arr = {3,2,3,1,1,4};
		int res = Item36.longestConsective(arr);
		System.out.println(res);
	}
}
