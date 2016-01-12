/**
 * 在构造器中打印自己的消息和传入的参数
 *
 * @author rankin_dean@163.com
 */
public class Ch5_4{
	public String str = "自己的消息";
	Ch5_4(){
		//System.out.println("默认构造器");
	}
	Ch5_4(String s){
		System.out.println(str + "+" + s);
	}
	public static void main(String[] args){
		Ch5_4 obj = new Ch5_4("构造器添加的消息");
	}
}
/*	Output:
	自己的消息+构造器添加的消息
*/