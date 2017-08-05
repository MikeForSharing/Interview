package JianZhiOffer;

public class HungrySingleton {
	private static HungrySingleton sin = new HungrySingleton();
	private HungrySingleton() {
		
	}
	
	public  HungrySingleton getInstance() {
		return sin;
	}
	
}
