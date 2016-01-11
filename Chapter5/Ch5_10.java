/**
 * finalize方法
 *
 * @author rankin_dean@163.com
 */
 public class Ch5_10{
	 protected void finalize(){
		 System.out.println("finalize ...");
	 }
	 public static void main(String[] args){
		 Ch5_10 obj = new Ch5_10();
	 }
 }