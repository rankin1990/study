/**
 * 二进制形式显示char类型的值
 *
 * @author rankin_dean@163.com
 */
 
public class Ch3_13{
	public static void main(String[] args){
		char ch1 = 'a';
		char ch2 = 'b';
		char ch3 = 'c';
		char ch4 = 'd';
		showCharToBinary(ch1);
		showCharToBinary(ch2);
		showCharToBinary(ch3);
		showCharToBinary(ch4);
	}
	
	static void showCharToBinary(char ch){
		int i = ch;
		System.out.println("ASCII:"+i+","+Integer.toBinaryString(i));
	}
	
}
/*	Output:
	ASCII:97,1100001
	ASCII:98,1100010
	ASCII:99,1100011
	ASCII:100,1100100
*/