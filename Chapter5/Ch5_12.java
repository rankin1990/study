/**
 * finalize方法
 *
 * @author rankin_dean@163.com
 */
public class Ch5_12{
	public boolean isEmpty;
	
	protected void finalize(){
		if(isEmpty){
			System.out.println("finalize ...");
		}	 
	}
	
	public static void main(String[] args){
		Ch5_12 obj = new Ch5_12();
		System.gc();
	 }
 }