/**
 *  对象数组初始化
 *
 * @author rankin_dean@163.com
 */
public class Ch5_18{
	public static void main(String[] args){
		box[] boxs = new box[10];
		for(int i=0;i<boxs.length;i++){
			boxs[i] = new box();
			//boxs[i] = new box("对象数组"+i);
		}
	}
}

class box {
	static int i = 0;
	box(){
		System.out.println("Box"+i);
		++i;
	}
	box(String s){
		System.out.println(s);
	}
}
/*	Output:
	Box0
	Box1
	Box2
	Box3
	Box4
	Box5
	Box6
	Box7
	Box8
	Box9
*/