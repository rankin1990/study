/**
 * 方法别名
 *
 * @author rankin_dean@163.com
 */
 
public class Ch3_3{
	static void f(Letter l){
		l.ch = 'c';
	}
	
	public static void main(String[] args){
		Letter letter = new Letter();
		letter.ch = 'x';
		System.out.println(letter.ch);
		f(letter);
		System.out.println(letter.ch);
	}
}

class Letter{
	char ch;
}
/*	Output:
	x
	c
*/