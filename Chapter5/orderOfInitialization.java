/**
 * 初始化顺序
 *
 * @author rankin_dean@163.com
 */
public class OrderOfInitialization{
	  	 
	public static void main(String[] args){
		House obj = new House();
		obj.f();
	}
}
 
class Window{
	Window(int i){
		System.out.println("Window"+i);
	}
}
	 
class House{
	Window w1 = new Window(1);
	House(){
		System.out.println("House"); 
		Window w33 = new Window(33);
	}
	Window w2 = new Window(2);
	void f(){System.out.println("f()");}
	Window w3 = new Window(3);
}
/*	Output:
	Window1
	Window2
	Window3
	House
	Window33
	f()
*/