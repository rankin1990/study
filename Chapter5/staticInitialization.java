/**
 * 静态数据的初始化顺序
 * 静态变量初始化->非静态变量初始化->构造器初始化
 *
 * @author rankin_dean@163.com
 */
public class StaticInitialization{
	  	 
	public static void main(String[] args){
		new Cupboard();
		System.out.println("3-------");
		new Cupboard();
		System.out.println("4-------");
		table.f2(1);
		System.out.println("5-------");
		cupboard.f3(1);
	}
	static Table table = new Table();
	static{
		System.out.println("1-------");
	}
	static Cupboard cupboard = new Cupboard();
	static{
		System.out.println("2-------");
	}
}
 
//碗
class Bowl{
	Bowl(int i){
		System.out.println("Bowl:"+i);
	}
	void f1(int i){
		System.out.println("f1:"+i);
	}
}
	 
//桌子
class Table{
	static Bowl bowl1 = new Bowl(1);
	Table(){
		System.out.println("Table()");
		bowl2.f1(1);
	}
	void f2(int i){
		System.out.println("f2:"+i);
	}
	static Bowl bowl2 = new Bowl(2);
}

//碗柜
class Cupboard{
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	Cupboard(){
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	void f3(int i){
		System.out.println("f3:"+i);
	}
	static Bowl bowl5 = new Bowl(5);
}
/*	Output:
	Bowl:1
	Bowl:2
	Table()
	f1:1
	1-------
	Bowl:4
	Bowl:5
	Bowl:3
	Cupboard()
	f1:2
	2-------
	Bowl:3
	Cupboard()
	f1:2
	3-------
	Bowl:3
	Cupboard()
	f1:2
	4-------
	f2:1
	5-------
	f3:1
*/