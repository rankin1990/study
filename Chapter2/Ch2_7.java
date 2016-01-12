/**
 * 实现Incrementable代码
 *
 * @author rankin_dean@163.com
 */
public class Ch2_7{
	static void increment(){
		staticTest.i++;
	}
	public static void main(String[] args){
		Ch2_7 obj = new Ch2_7();
		obj.increment();
		System.out.println(staticTest.i);
	}
}
class staticTest{
	static int i = 47;
}
/*  Output:
	48
*/