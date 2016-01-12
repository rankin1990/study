/**
 * 简短打印和正常打印
 *
 * @author rankin_dean@163.com
 */
 
public class Ch3_1{
	public static void main(String[] args){
		Print.print("使用简短打印");
		System.out.println("使用正常打印");
	}
}

class Print{
	static void print(String s){
		System.out.println(s);
	}
}
/*	Output:
	使用简短打印
	使用正常打印
*/