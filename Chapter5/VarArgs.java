/**
 * 可变参数列表，数组实现
 *
 * @author rankin_dean@163.com
 */

public class VarArgs{
	public static void printArray(Object[] objs){
		for(Object obj:objs){
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		VarArgs.printArray(new Object[]{"one","two","three"});
		VarArgs.printArray(new Object[]{new Integer(47),new Float(3.14),
		new String("3")});
		VarArgs.printArray(new Object[]{new A(),new A(),new A()});
	}
}

class A{}
/*	Output:
	one two three 
	47 3.14 3 
	A@1fb8ee3 A@61de33 A@14318bb
*/
 