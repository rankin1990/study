/**
 * 静态初始化
 *
 * @author rankin_dean@163.com
 */
public class Ch5_14{
	static String s1 = "123";
	static String s2;

	static{
		s2 = "456";
	}
	
	static void printStatic(){
		System.out.println(s1);
		System.out.println(s2);
	}
	 
	public static void main(String[] args){
		Ch5_14.printStatic();
	}
}
/*	Output:
	123
	456
*/
 
 