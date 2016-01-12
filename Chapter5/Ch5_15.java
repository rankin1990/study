/**
 * 非静态实例初始化
 *
 * @author rankin_dean@163.com
 */
public class Ch5_15{
	  
	public static void main(String[] args){
		new Mugs();
		new Mugs(1);
	}
}
 
class Mugs{
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
	}
	Mugs(){
		System.out.println("Mugs");
	}
	Mugs(int i){
		System.out.println("Mugs"+i);
	}
}
 
class Mug{
	Mug(int i){
		System.out.println("Mug:"+i);
	}
}
/*	Output:
	Mug:1
	Mug:2
	Mugs
	Mug:1
	Mug:2
	Mugs1
*/
 
 