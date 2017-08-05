package JianZhiOffer;

import java.util.Arrays;



public class IQ24 {
	public boolean VerifySquenceOfBST(int[] sequence) {
		if(sequence == null || sequence.length ==0) {
			return false;
		}
		int length = sequence.length;
		int root = sequence[length-1];
		int cut = 0;
		
		for(int i=0;i<=length-1;i++) {
			if(sequence[i]>sequence[length-1]) {
				cut = i+1;
				break;
			}
		}
		if(cut==0) {
			VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, length-1));
		}else{
			for(int i=cut;cut<length-1;i++) {
				if(sequence[cut] <sequence[length-1]) {
					return false;
				}
			}
		}
		boolean left = true;
		if(cut>0) {
			left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, cut));
		}
		boolean right = true;
		if(cut<length-1) {
			right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, cut, length-1));
		}
		return left&&right;
	}
	
	public static void main(String[] args) throws Exception {
		int[] seq= {1,4,2,5};
		IQ24 test = new IQ24();
		System.out.println(test.VerifySquenceOfBST(seq));
	}

}



