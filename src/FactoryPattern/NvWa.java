package FactoryPattern;

public class NvWa {
	public static void main(String[] args) {
		
		AbstractHumanFactory fac = new HumanFactory();
		Human whiteMan = fac.createHuman(WhiteHuman.class);
		whiteMan.getColor();
		whiteMan.talk();
		
		Human yellowMan = fac.createHuman(YellowHuman.class);
		yellowMan.getColor();
		yellowMan.talk();
		
		Human blackMan = fac.createHuman(BlackHuman.class);
		blackMan.getColor();
		blackMan.talk();
	}
}
