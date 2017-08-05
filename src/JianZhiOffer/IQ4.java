package JianZhiOffer;

public class IQ4 {

	public static String replaceSpace(StringBuffer str) {
		if(str == null) {
			return null;
		}
    	StringBuffer strRep = new StringBuffer();
    	for(int i=0;i<str.length();i++) {
    		if(str.charAt(i) == ' ') {
    			strRep.append('%');
    			strRep.append('2');
    			strRep.append('0');
    		}else{
        		strRep.append(str.charAt(i));
    		}
    	}
    	return strRep.toString();
    }
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("hello mike");
		IQ4.replaceSpace(str);
	}

}
