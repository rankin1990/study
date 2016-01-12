/**
 * static域只有一个实例
 *
 * @author rankin_dean@163.com
 */
public class Ch2_8{
	static int counter;
	public static void main(String[] args){
		Ch2_8 obj1 = new Ch2_8();
		obj1.counter++;
		Ch2_8 obj2 = new Ch2_8();
		obj2.counter++;
		Ch2_8 obj3 = new Ch2_8();
		obj3.counter++;
		System.out.println(Ch2_8.counter);
	}
}
/*  Output:
	48
*/