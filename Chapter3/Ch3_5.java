/**
 * 打印狗的名字和叫声
 *
 * @author rankin_dean@163.com
 */
 
public class Ch3_5{

	public static void main(String[] args){
		Dog dog1 = new Dog("spot","Ruff!");
		Dog dog2 = new Dog("scruffy","Wurf!");
		printNameAndSays(dog1);
		printNameAndSays(dog2);
		
	}
	
	static void printNameAndSays(Dog dog){
		System.out.println("Name:"+dog.name+"   Says:"+dog.says);
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
	Name:spot   Says:Ruff!
	Name:scruffy   Says:Wurf!
*/