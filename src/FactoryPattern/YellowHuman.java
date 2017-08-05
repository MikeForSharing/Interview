package FactoryPattern;

public class YellowHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("我是黄种人");
		
	}

	@Override
	public void talk() {
		System.out.println("黄种人会说话！");
		
	}

}
