package FactoryPattern;

public class HumanFactory extends AbstractHumanFactory {
	public <T extends Human> T createHuman(Class<T> c) {
		Human man = null;
		try {
			man = (Human)Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T) man;
	}
	
	
	public void myself() {
		System.out.print(" ");
	}
}
