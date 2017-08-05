package coderInterviewGuide;

import java.util.Stack;

class Father{
	public void func1() {
		func2();
	}
	public void func2() {
		System.out.println("AAA");
	}
}

class Child extends Father{
	public void func1(int a) {
		System.out.println("BBB");
	}
	public void func2() {
		System.out.println("CCC");
	}
}


public class Item26 {
	public static void main(String[] args){
		Father child = new Child();
		child.func1();
	}
}
