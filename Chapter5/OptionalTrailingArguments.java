/**
 * 可选尾随参数
 *
 * @author rankin_dean@163.com
 */

public class OptionalTrailingArguments{
	static void printArray(int required,String... trailing){
		System.out.print("required:"+required+" ");
		for(String obj:trailing){
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		printArray(1,"one");
		printArray(1,"one","two");
		printArray(1);
	}
}

class A{}
/*	Output:
	required:1 one 
	required:1 one two 
	required:1
*/
 