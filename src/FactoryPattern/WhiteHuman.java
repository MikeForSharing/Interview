package FactoryPattern;

public class WhiteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("我是白种人");
		
	}

	@Override
	public void talk() {
		System.out.println("白种人会说话！");
		
	}

}
