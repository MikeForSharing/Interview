package JianZhiOffer;



public class Test {
	public static void main(String[] args) {
		long result1 = 1;
		for(int i=0;i<36;i++) {
			result1 = result1 *2;
		}
		result1 = (result1-1)*(1375)/8698624;
		
		long result2 = 1;
		for(int i=0;i<32;i++) {
			result2 = result2 *2;
		}
		result2 = (result2-1)*(351564)/8348435;

		
		long result3 = 1;
		for(int i=0;i<31;i++) {
			result3 = result3 *2;
		}
		result3 = (result3-1)*(490242)/8209757;
		
		System.out.println(result2-result3);
	}

}


