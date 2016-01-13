/**
 *  新建数组
 *
 * @author rankin_dean@163.com
 */
 import java.util.*;
 public class ArrayNew{
	  
	 public static void main(String[] args){
		 Random rand = new Random(47);
		 int counter = rand.nextInt(10);
		 int[] arr = new int[counter];
		 System.out.println(Arrays.toString(arr));
	 }
 }
 

 