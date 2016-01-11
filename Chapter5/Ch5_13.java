/**
 * 静态代码块
 *
 * @author rankin_dean@163.com
 */
 public class Ch5_13{
	  	 
	 public static void main(String[] args){
		 //Cups.cup1.f1(99);
	 }
	 static Cups cups1 = new Cups();
 }
 
 //
 class Cup{
	Cup(int i){
		System.out.println("Cup:"+i);
	}
	void f1(int i){
		System.out.println("f1:"+i);
	}
}
	 
//
class Cups{
	static Cup cup1;
	static Cup cup2;
	static{
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups(){
		System.out.println("Cups()");
	}
}

