/**
 * 直接常量
 *
 * @author rankin_dean@163.com
 */
 
import java.util.*;

public class Ch3_8{
	public static void main(String[] args){
		long l1 = 0x112233L;
		long l2 = 0344567L;
		System.out.println(Long.toBinaryString(l1));
		System.out.println(Long.toBinaryString(l2));
	}
}
/*	Output:
	100010010001000110011
	11100100101110111
*/