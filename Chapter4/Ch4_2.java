/**
 * 产生随机数
 *
 * @author rankin_dean@163.com
 */

import java.util.*;

public class Ch4_2{
	public static void main(String[] args){
		Random ran = new Random();
		int[] arr = new int[25];
		for(int i=0;i<25;i++){
			arr[i] = ran.nextInt(100);
			System.out.println(arr[i]);
		}
	}
}
/*	Output:
	78
	2
	68
	48
	41
	81
	39
	87
	17
	63
	67
	63
	41
	77
	38
	75
	90
	26
	74
	95
	19
	19
	85
	11
	50
*/