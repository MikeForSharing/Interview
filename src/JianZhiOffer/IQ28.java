package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

public class IQ28 {
	ArrayList<String> result = new ArrayList<String>();

	public ArrayList<String> PermutationHelper(char[] chs,int start,int end) {
		if(start == end) {
			result.add(String.valueOf(chs));			
		}else {
			for(int i=start;i<=end;i++) {
				if(i!=start&&chs[start]==chs[i])
					continue;
				char tmp = chs[start];
				chs[start] = chs[i];
				chs[i] = tmp;
				PermutationHelper(chs,start+1,end);
				tmp = chs[start];
				chs[start] = chs[i];
				chs[i] = tmp;
				
			}
		}
		
		return result;
	}
	
	public ArrayList<String> Permutation(String str) {
		char[] chs = str.toCharArray();
		result = PermutationHelper(chs,0,chs.length-1);
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		String str = "abc";
		
		ArrayList<String> arr = new IQ28().Permutation(str);
		System.out.println(arr);
	}

}
