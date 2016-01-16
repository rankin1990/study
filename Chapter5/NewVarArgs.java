/**
 * 可变参数列表
 *
 * @author rankin_dean@163.com
 */

public class NewVarArgs{
	static void printArray(Object... objs){
		for(Object obj:objs){
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		printArray("one","two","three");
		printArray(1,3.14F,11.11);
		printArray(new Integer(1),new Float(3.14F),new Double(11.11));
		printArray(new A(),new A(),new A());
		printArray((Object [])new Integer[]{1,2,3,4});
		printArray();
	}
}

class A{}
/*	Output:
	one two three 
	1 3.14 11.11 
	1 3.14 11.11 
	A@61de33 A@14318bb A@ca0b6 
	1 2 3 4
	
*/
 