/**
 * 按位操作符
 *
 * @author rankin_dean@163.com
 */
 
public class Ch3_10{
	// 1010 1010
	public static int const1 = 0xAA; 
	// 0101 0101
	public static int const2 = 0x55;
	
	public static void main(String[] args){
		System.out.println("const1:"+Integer.toBinaryString(const1));
		System.out.println("const2:"+Integer.toBinaryString(const2));
		System.out.println("const1&const2:"+Integer.toBinaryString(const1&const2));
		System.out.println("const1|const2:"+Integer.toBinaryString(const1|const2));
		System.out.println("const1^const2:"+Integer.toBinaryString(const1^const2));
		System.out.println("~const2:"+Integer.toBinaryString(~const2));
		
	}
}
/*	Output:
	const1:10101010
	const2:1010101
	const1&const2:0
	const1|const2:11111111
	const1^const2:11111111
	~const2:11111111111111111111111110101010
*/