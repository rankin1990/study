/**
 * 数组初始化
 *
 * @author rankin_dean@163.com
 */
 public class arrayOfPrimitives{
	  
	 public static void main(String[] args){
		 int[] a1 = {1,2,3,4,5};
		 int[] a2 = a1;
		 for(int i=0;i<a2.length;i++){
			 a2[i] = a2[i]+1;
		 }
		 for(int i=0;i<a1.length;i++){
			 System.out.println("a1["+i+"]="+a1[i]);
		 }
	 }
 }
 

 