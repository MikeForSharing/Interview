package ObservePattern;

public class Watch extends Thread {
	private HanFeiZi hanfeizi;
	private LiSi lisi;
	private String type;
	
	public Watch(HanFeiZi hanfeizi, LiSi lisi, String type) {
		this.hanfeizi = hanfeizi;
		this.lisi = lisi;
		this.type = type;
	}
	
	public void run() {
		while(true) {
			if(type.equals("breakfast")) {
				if(this.hanfeizi.isHaveBreakfast()) {
					System.out.println("hanfeizi.isHaveFun():" + hanfeizi.isHaveFun());
					lisi.update(type);
					this.hanfeizi.setHaveBreakfast(false);
				}
			}else{
				if(this.hanfeizi.isHaveFun()) {
					System.out.println("hanfeizi.isHaveFun():" + hanfeizi.isHaveFun());
					lisi.update(type);
					this.hanfeizi.setHaveFun(false);
				}
			}
		}
	}
	
}	
