/**
 * 逻辑操作符 模拟扔硬币
 *
 * @author rankin_dean@163.com
 */
 
import java.util.*;

public class Ch3_7{
	public static void main(String[] args){
		Random ran = new Random();
		int i = ran.nextInt(100);
		int j = ran.nextInt(100);
		System.out.println("硬币是正面:"+(i>j));
	}
}
/*	Output:
	硬币是正面:false
*/