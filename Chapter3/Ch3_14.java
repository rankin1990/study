/**
 * 字符串比较 
 *
 * @author rankin_dean@163.com
 */
 
public class Ch3_14{
	public static void main(String[] args){
		String str1 = "I like coding";
		String str2 = "Rankin";
		compareTwoString(str1,str2);
	}
	
	static void compareTwoString(String str1,String str2){
		System.out.println(str1==str2?"str1==str2":"str1!=str2");
	}
}
/*	Output:
	str1!=str2
*/