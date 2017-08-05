package JianZhiOffer;


public class IQ9 {
	public int Fibonacci(int n) {
		int fib = 0;
		int one = 0;
		int two = 1;
		if(n==0) {
			return one;
		}if(n==1) {
			return two;
		}
		for(int i=2;i<=n;i++) {
			fib = one + two;
			one = two;
			two = fib;
		}
		return fib;
		
    }	
	
	public static void main(String[] args) {
		IQ9 q = new IQ9();
		int num = q.Fibonacci(41);
		System.out.println(num);
		
		
	}
		
}

















