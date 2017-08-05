package JianZhiOffer;

import java.util.Arrays;
import java.util.Vector;

public class IQ14 {
	public void reOrderArray(int[] array) {
		if(array.length ==0)
			return;
		Vector Arr = new Vector();
		int i,j;
		for(i=0;i<array.length;i++) {
			if((array[i]&1)!=0) {
				Arr.add(array[i]);
			}
		}
		for(j=0;j<array.length;j++) {
			if((array[j]&1)==0) {
				Arr.add(array[j]);
			}
		}
		for(int k=0;k<Arr.size();k++) {
			array[k] = (int) Arr.get(k);
		}
		
	}
		
	
	public static void main(String[] args) throws Exception {
		int[] a = {1,3,2,5,6,7};
		IQ14 q = new IQ14();
		q.reOrderArray(a);
		System.out.println(Arrays.toString(a));
		
		
		
	}
}
