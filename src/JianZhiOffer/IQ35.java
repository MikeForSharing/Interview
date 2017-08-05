package JianZhiOffer;


import java.util.LinkedHashMap;

public class IQ35 {

	private int FirstNotRepeatingChar(String str) {
		char[] charArr = str.toCharArray();
		LinkedHashMap<Character,Integer> charMap = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<charArr.length;i++) {
			if(charMap.containsKey(charArr[i])) {
				charMap.put(charArr[i], charMap.get(charArr[i]) + 1);
			}else {
				charMap.put(charArr[i], 1);
			}
		}
		
		for(char key:charMap.keySet()) {
			System.out.println(key + "  " + charMap.get(key));
		}
		
		for(char key:charMap.keySet()) {
			if(charMap.get(key)==1) {
				for(int j=0;j<charArr.length;j++) {
					if(key == charArr[j]) {
						return j;
					}
				}
			}
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) throws Exception {
		String str = "ababccd";
		int result = new IQ35().FirstNotRepeatingChar(str);
		System.out.println(result);
	}

}
