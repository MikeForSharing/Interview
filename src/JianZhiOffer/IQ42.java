package JianZhiOffer;
public class IQ42 {

	
	public String ReserveSentence(String str) {
		String[] strArr = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i=strArr.length-1;i>0;i--) {
			sb.append(strArr[i] + " ");
		}
		return sb.toString();
	}
	
	
	
	public static void main(String[] args) {
		String str = " I am mike.";
		IQ42 test = new IQ42();
		String result = test.ReserveSentence(str);
		System.out.println(result);
	}

}
