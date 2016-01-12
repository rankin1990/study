/**
 * DataOnly 数据赋值并打印
 *
 * @author rankin_dean@163.com
 */
public class Ch2_5{
	int i;
	double d;
	boolean b;
	public static void main(String[] args){
		Ch2_5 obj = new Ch2_5();
		obj.i = 47;
		obj.d = 1.1;
		obj.b = true;
		System.out.println("i="+obj.i);
		System.out.println("d="+obj.d);
		System.out.println("b="+obj.b);
	}
}
/*  Output:
	i=47
	d=1.1
	b=true
*/