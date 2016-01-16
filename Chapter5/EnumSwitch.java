/**
 * 枚举类型配合Switch
 *
 * @author rankin_dean@163.com
 */

public class EnumSwitch{
	Spiciness degree;
	
	EnumSwitch(Spiciness degree){
		this.degree = degree;
	}
	
	void describe(){
		System.out.print("The Value is:");
		switch(degree){
			case NOT:
				System.out.println("NOT");
				break;
			case MILD:
				System.out.println("MILD");
				break;
			case MEDIUM:
				System.out.println("MEDIUM");
				break;
			case HOT:
				System.out.println("HOT");
				break;
			default:
				System.out.println("wrong data");
		}
	}
	
	public static void main(String[] args){
		EnumSwitch e1 = new EnumSwitch(Spiciness.NOT);
		EnumSwitch e2 = new EnumSwitch(Spiciness.MEDIUM);
		e1.describe();
		e2.describe();
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
 