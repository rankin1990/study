/**
 * 别名
 *
 * @author rankin_dean@163.com
 */
 
public class Ch3_2{
	public static void main(String[] args){
		Tank t1 = new Tank();
		t1.f = 1.1f;
		Tank t2 = new Tank();
		t2.f = 2.2f;
		System.out.println("t1.f="+t1.f+"   t2.f="+t2.f);
		t1 = t2;
		t2.f++;
		System.out.println("t1.f="+t1.f+"   t2.f="+t2.f);
	}
}

class Tank{
	public float f;
}
/*	Output:
	t1.f=1.1   t2.f=2.2
	t1.f=3.2   t2.f=3.2
*/