package ObservePattern;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		HanFeiZi hanfeizi = new HanFeiZi();
		LiSi lisi = new LiSi();
		
		Watch watchHaveBreakfast = new Watch(hanfeizi,lisi,"breakfast");
		Watch watchHaveFun = new Watch(hanfeizi,lisi,"fun");
//		watchHaveBreakfast.start();
//		watchHaveFun.start();
		
		Thread.sleep(1000);
		hanfeizi.haveBreakfast();
		
		Thread.sleep(1000);
		hanfeizi.haveFun();

	}

}
