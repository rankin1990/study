/**
 * 多态1
 *
 * @author rankin_dean@163.com
 */

import java.util.*;
 
public class Polymorphism1{
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args){
		Shape[] shapes = new Shape[9];
		for(int i=0;i<shapes.length;i++){
			shapes[i] = gen.next();
		}
		for(Shape s:shapes){
			//动态绑定
			s.draw();
		}
	}
}

//工厂 factory
class RandomShapeGenerator{
	private Random ran = new Random(47);
	public Shape next(){
		switch(ran.nextInt(3)){
			default:
			case 0:
				return new Circle();
			case 1:
				return new Square();
			case 2:
				return new Triangle();
		}
	}
}

class Shape{
	public void draw(){}
	public void erase(){}
}

class Circle extends Shape{
	public void draw(){
		System.out.println("Circle draw() ...");
	}
	public void erase(){
		System.out.println("Circle erase() ...");
	}
}

class Square extends Shape{
	public void draw(){
		System.out.println("Square draw() ...");
	}
	public void erase(){
		System.out.println("Square erase() ...");
	}
}

class Triangle extends Shape{
	public void draw(){
		System.out.println("Triangle draw() ...");
	}
	public void erase(){
		System.out.println("Triangle erase() ...");
	}
}

/**	Output:
	Constructing
	s1 = define
	s2 = construct
	s3 = lazyInitialization
*/