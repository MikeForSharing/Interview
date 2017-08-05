package JianZhiOffer;
public class IQ42_2 {

	
	public String LeftRotateString(String str, int n) {
		StringBuffer sb = new StringBuffer();
		String pre = str.substring(0,n);
		String behind = str.substring(n,str.length());
		sb.append(behind);
		sb.append(pre);
		return sb.toString();
	}
	
	
	
	public static void main(String[] args) {
		String str = "abcdef";
		IQ42_2 test = new IQ42_2();
		String result = test.LeftRotateString(str, 2);
		System.out.println(result);
	}

}
