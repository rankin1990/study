/**
 * 两个变量，一个在定义时初始化，另一个通过构造器初始化
 *
 * @author rankin_dean@163.com
 */
public class Ch5_2{
	public String s1 = "定义时就被初始化";
	public String s2;
	Ch5_2(String s){
		this.s2 = s;
	}
	public static void main(String[] args){
		Ch5_2 obj = new Ch5_2("通过构造器初始化");
		System.out.println(obj.s1);
		System.out.println(obj.s2);
	} 
}