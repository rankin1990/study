/**
 * 根据不同的基本类型进行重载，两个参数顺序相反
 *
 * @author rankin_dean@163.com
 */
 public class Ch5_6{
	 public void bark(byte b,int i){
		 System.out.println("barking");
	 }
	 
	 public void bark(int i,byte b){
		 System.out.println("howling");
	 }
	 
	 public static void main(String[] args){
		 Ch5_6 obj = new Ch5_6();
		 char x = 'x';
		 byte b = 1;
		 int i = 2;
		 short s = 3;
		 obj.bark(b,i);
		 obj.bark(i,b);
		 obj.bark(s,b);
		 /*
		  对bark的引用不明确，Ch5_6中的方法bark(byte,int)和Ch5_6中的方法
		  bark(int,byte) 都匹配
		  */
		 //obj.bark(b,b);	 
		 //obj.bark(s,x);
	 }
 }