package ObservePattern;

public class LiSi implements ILiSi{

	@Override
	public void update(String context) {
		System.out.println("李斯：发现了动静，开始像秦始皇汇报工作...");
		reportContext(context);
		System.out.println("李斯：报告完毕。");
	}

	
	public void reportContext(String context) {
		System.out.println("李斯：报告秦始皇，韩非子有动静了：" + context);
	}
}
