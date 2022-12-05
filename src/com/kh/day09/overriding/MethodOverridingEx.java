package com.kh.day09.overriding;

public class MethodOverridingEx {

	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		Line line = new Line();
//		line.draw(); //오버라이딩된거출력됨
		paint(line);
		paint(new Rect());
		paint(new Circle());
	}

}
