/**
 * finalize方法始终调用
 *
 * @author rankin_dean@163.com
 */
public class Ch5_11{
	protected void finalize(){
		System.out.println("finalize ...");
	}
	public static void main(String[] args){
		Ch5_11 obj = new Ch5_11();
		System.gc();
	}
}