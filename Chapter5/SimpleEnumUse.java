/**
 * 枚举类型
 *
 * @author rankin_dean@163.com
 */

public class SimpleEnumUse{
	public static void main(String[] args){
		Spiciness sp = Spiciness.MEDIUM;
		System.out.println(sp);
		for(Spiciness s:Spiciness.values()){
			System.out.println(s + ",ordinal " + s.ordinal());
		}
	}
}

enum Spiciness{
	NOT,MILD,MEDIUM,HOT
}
/*	Output:
	MEDIUM
	NOT,ordinal 0
	MILD,ordinal 1
	MEDIUM,ordinal 2
	HOT,ordinal 3
*/
 