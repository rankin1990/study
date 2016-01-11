/**
 * 根据不同的基本类型进行重载
 *
 * @author rankin_dean@163.com
 */
 public class Ch5_5{
	 public void bark(byte x){
		 System.out.println("barking");
	 }
	 
	 public void bark(int x){
		 System.out.println("howling");
	 }
	 
	 public static void main(String[] args){
		 Ch5_5 obj = new Ch5_5();
		 char x = 'x';
		 byte b = 1;
		 int i = 2;
		 short s = 3;
		 obj.bark(x);
		 obj.bark(b);
		 obj.bark(i);
		 obj.bark(s);
	 }
 }