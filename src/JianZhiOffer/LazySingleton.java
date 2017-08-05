package JianZhiOffer;

public class LazySingleton {
	
	private static LazySingleton sin = null;
	private LazySingleton() {
		
	}
	
	public synchronized LazySingleton getInstance() {
		if(sin == null) {
			sin = new LazySingleton();
		}
		return sin;
	}
}
