/**
 * 关系操作符 测试equals和==
 *
 * @author rankin_dean@163.com
 */
 
public class Ch3_6{
	public static void main(String[] args){
		Dog dog1 = new Dog("spot","Ruff!");
		Dog dog2 = new Dog("scruffy","Wurf!");
		Dog dog3 = dog1;
		System.out.println(dog1==dog2);
		System.out.println(dog1==dog3);
		System.out.println("dog1.equals(dog2):"+dog1.equals(dog2));
		System.out.println("dog1.equals(dog3):"+dog1.equals(dog3));
		
	}
}

class Dog{
	String name;
	String says;
	Dog(String name,String says){
		this.name = name;
		this.says = says;
	}
}
/*	Output:
	false
	true
	dog1.equals(dog2):false
	dog1.equals(dog3):true
*/