package JianZhiOffer;


public class IQ10 {
	
	public int findOne(int n) {
		int count = 0;
		while(n!=0) {
			count++;
			n=n&(n-1);
		}
		return count;
		
    }	
	
	public static void main(String[] args) {
		IQ10 q = new IQ10();
		int num = q.findOne(13);
		System.out.println(num);
		
		
	}
		
}

















