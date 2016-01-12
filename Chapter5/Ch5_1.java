/**
 * 验证引用未初始化的值
 *
 * @author rankin_dean@163.com
 */
public class Ch5_1{
	public String s;
	public static void main(String[] args){
		Ch5_1 obj = new Ch5_1();
		System.out.println(obj.s);
	} 
}
/*	Output:
	null
*/