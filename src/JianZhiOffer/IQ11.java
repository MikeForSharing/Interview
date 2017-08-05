package JianZhiOffer;


public class IQ11 {

	public double power(double base,int exponent) throws Exception {
		double result = 0.0;

		if(equal(base,0.0)&&exponent<0) {
			throw new Exception("0的负指数没有意义");
		}
		if(exponent<=0) {
			int absExponent = -exponent;
			result = 1/powerWithExponent(base,absExponent);
		}else {
			result = powerWithExponent(base,exponent);
		}
		return result;
    }	
	
	public double powerWithExponent(double base,int exponent) {
		double result = 1.0;
		if(exponent == 0) {
			return 1;
		}
		if(exponent == 1) {
			return base;
		}
		for(int i=0;i<exponent;i++) {
			result *= base;
		}
		return result;
	}
	
	public boolean equal(double num1,double num2) {
		if((num1-num2 > -0.00000001)&&(num1-num2)<0.00000001) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		IQ11 q = new IQ11();
		double num = q.power(0,3);
		System.out.println(num);
		
		
	}
		
}

















