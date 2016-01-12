/**
 * 两个构造器，在第一个中通过this调用第二个
 *
 * @author rankin_dean@163.com
 */
public class Ch5_9{
	//对this的调用必须是构造函数中的第一个语句
	Ch5_9(){
		this(100);
	}
	 
	Ch5_9(int i){
		System.out.println("i="+i);
	}
	public static void main(String[] args){
		Ch5_9 obj = new Ch5_9();
	}
}
/*	Output:
	i=100
*/