package src;

/**
 * 当JVM进程启动的时候，会从类加载路径中找到包含main方法的入口类JVMHello
 * 找到JVMHello后会直接读取该文件的二进制数据并且把该类的信息放到运行时的Method Area中，
 * 然后会定位到JVMHello中main方法的字节码并开始执行main方法中的指令：
 * Student student = new Student("mike");
 * 此时会创建Student实例对象并且使用student来引用该对象（或说对该对象命令），其内幕如下：
 * 第1步：JVM会直接到Method区域中去查找Student类的信息，此时发现没有Student类，就通过
 * 		类加载器加载该Student类文件；
 * 第2步：在JVM的Method区域加载并找到了Student类之后会在Heap区域中为Student实例对象
 * 		分配内存并且在Student的实例对象中持有指向方法区域中的Student类的应用(内存地址)
 * 第3步：JVM实例完成后会在当前线程中为Stack中的reference建立实际的应用关系，此时会赋值给student
 * 
 * 在JVM中方法的调用一定是属于线程的行为，也就是说方法调用本身会发生调用线程的方法调用栈。
 * 线程的方法调用栈（Method Stack Frames）,每一个方法的调用就是方法调用栈中的一个Frame,该
 * Frame包含了方法的参数、局部变量、临时数据等；
 *  
 * @author mike
 *
 */
public class JVMHello {
	/**
	 * JVM在运行的时候会通过反射的方式到Method Area区域找到入口类的入口方法main
	 * @param args
	 */
	public static void main(String[] args) { //main这个方法是放在Method Area中的
		/**
		 * student是放在主线程中的Stack区域中的
		 * Student对象实例是放在所有线程共享的heap中的
		 */
		Student student = new Student("mike");
		
		/**
		 * 指针就是直接指向heap中的对象，句柄就是student指向句柄，在通过句柄指向对象
		 * 首先通过student指针（句柄）找到Student对象，当找到该对象后，会通过对象内部指向Method Area的指针
		 * 来调用具体的方法去执行任务。
		 */
		student.sayHello();
	}
}

class Student {
	//name作为成员变量是放在stack区域的，但是name指向的string对象是存放在Heap中的。
	private String name;
	public Student(String name) {
		this.name = name;
	}
	public void sayHello() {//sayHello这个方法是放在Method Area中的
		System.out.println("hello, this is " + this.name);
	}
}