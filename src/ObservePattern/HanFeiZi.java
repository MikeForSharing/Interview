package ObservePattern;

import java.util.Observable;

public class HanFeiZi  implements IHanFeiZi{
	LiSi lisi = new LiSi();
	boolean isHaveBreakfast = false;
	boolean isHaveBreakfast() {
		return isHaveBreakfast;
	}

	void setHaveBreakfast(boolean isHaveBreakfast) {
		this.isHaveBreakfast = isHaveBreakfast;
	}


	boolean isHaveFun = false;
	boolean isHaveFun() {
		return isHaveFun;
	}

	void setHaveFun(boolean isHaveFun) {
		this.isHaveFun = isHaveFun;
	}

	@Override
	public void haveBreakfast() {
		System.out.println("I am going to start to have breakfaset");
		lisi.update("韩非子在吃饭");
//		this.setHaveBreakfast(true);
	}
	

	@Override
	public void haveFun() {
		System.out.println("I am going to start to have fun");
		lisi.update("韩非子在娱乐");
//		this.setHaveFun(true);
	}

	
	
}
