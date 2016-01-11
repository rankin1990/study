/**
 * this关键字
 *
 * @author rankin_dean@163.com
 */
 public class Ch5_8{
	 public void methodA(){
		 System.out.println("MethodA");
		 methodB();
		 this.methodB();
	 }
	 
	 public void methodB(){
		 System.out.println("MethodB");
	 }
	 public static void main(String[] args){
		 Ch5_8 obj = new Ch5_8();
		 obj.methodA();
	 }
 }