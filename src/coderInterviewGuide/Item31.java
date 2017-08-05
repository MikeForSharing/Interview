package coderInterviewGuide;

public class Item31 {
	public static void hanDigui(int n,String from,String mid, String to) {
		if(n>0) {
			if(n==1) {
				System.out.println("move from " + from + " to " + to );
			}else{
				hanDigui(n-1,from, to, mid);
				hanDigui(1,from,mid,to);
				hanDigui(n-1,mid,from,to);
			}

		}
	}
	
	public static void main(String[] args){
		Item31.hanDigui(22, "1", "2", "3");
	}
}
