/**
 * 惰性初始化
 *
 * @author rankin_dean@163.com
 */
 
public class LazyInitialization{
	
	private String s1 = "define";
	private String s2;
	private String s3;
	
	LazyInitialization(){
		System.out.println("Constructing");
		s2 = "construct";
	}
	
	public String toString(){
		if(s3 == null){
			s3 = "lazyInitialization";
		}
		return
			"s1 = " + s1 + "\n" +
			"s2 = " + s2 + "\n" +
			"s3 = " + s3 + "\n" ;
	}
	
	public static void main(String[] args){
		LazyInitialization l = new LazyInitialization();
		System.out.print(l);
	}
}
/**	Output:
	Constructing
	s1 = define
	s2 = construct
	s3 = lazyInitialization
*/