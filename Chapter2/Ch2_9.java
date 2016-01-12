/**
 * 自动包装
 *
 * @author rankin_dean@163.com
 */
public class Ch2_9{
	static int counter;
	public static void main(String[] args){
		int a = 0;
		Integer integer = a;
		char c = 'x';
		Character character = c;
		Character ch = new Character('X');
		char ch2 = ch;
		System.out.println(integer);
		System.out.println(character);
		System.out.println(ch2);
	}
}
/*  Output:
	0
	x
	X
*/