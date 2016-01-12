/**
 * 调用storage()代码
 *
 * @author rankin_dean@163.com
 */
 public class Ch2_6{
	 int storage(String s){
		 return s.length()*2;
	 }
	 public static void main(String[] args){
		 Ch2_6 obj = new Ch2_6();
		 System.out.println(obj.storage("rankin"));
	 }
 }
 /* Output
	12
 */