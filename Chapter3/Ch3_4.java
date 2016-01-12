/**
 * 计算速度
 *
 * @author rankin_dean@163.com
 */
 
import java.util.*;

public class Ch3_4{
	public static int distance;
	public static int time;
	public static int speed;
	
	public static void main(String[] args){
		Random ran = new Random(47);
		distance = ran.nextInt(100);
		time = ran.nextInt(10);
		speed = distance/time;
		System.out.println("distance="+distance);
		System.out.println("time="+time);
		System.out.println("speed="+speed);
	}
}

class Letter{
	char ch;
}
/*	Output:
	distance=58
	time=5
	speed=11
*/