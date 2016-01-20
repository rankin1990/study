/**
 * 抽象类
 *
 * @author rankin_dean@163.com	
 *
 */
 
enum Note{
	MIDDLE_C, C_SHARP, B_FLAT;
}

abstract class Instrument{
	public abstract void play(Note n);
	public String what(){return null;}
	public abstract void adjust();
}

class Wind extends Instrument{
	public void play(Note n){
		System.out.println("Wind play..." + n);
	}
	public String what(){
		return "Wind";
	}
	public void adjust(){}
}

class Stringed extends Instrument{
	public void play(Note n){
		System.out.println("Stringed play..." + n);
	}
	public String what(){
		return "Stringed";
	}
	public void adjust(){}
}

public class Abstract{
	
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] e){
		for(Instrument i:e){
			tune(i);
		}
	}
	
	public static void main(String[] args){
		Instrument[] instruments = new Instrument[]{
			new Wind(),
			new Stringed()
		};
		tuneAll(instruments);
	}
}
/**	Output:
	Wind play...MIDDLE_C
	Stringed play...MIDDLE_C
*/