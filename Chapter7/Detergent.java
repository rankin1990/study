/**
 * 继承
 *
 * @author rankin_dean@163.com
 */

//清洁剂
public class Detergent extends Cleanser{
	//change method:
	public void scrub(){
		append(" Detergent.scrub()");
		super.scrub();
	}
	
	//add method to the interface: 
	//弄出泡沫
	public void foam(){
		append(" foam()");
	}
	
	public static void main(String[] args){
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.print("Testing the base class:");
		Cleanser.main(args);
	}
}

//清洁工
class Cleanser{
	private String s = "Cleanser";
	
	//添加
	public void append(String str){
		s += str;
	}
	
	//稀释
	public void dilute(){
		append(" dilute()");
	}
	
	//涂抹
	public void apply(){
		append(" apply()");
	}
	
	//擦洗
	public void scrub(){
		append(" scrub()");
	}
	
	public String toString(){
		return s;
	}
	
	public static void main(String[] args){
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}


/*	Output:
	Cleanser dilute() apply() Detergent.scrub() scrub() foam()
	Testing the base class:Cleanser dilute() apply() scrub()
*/
 