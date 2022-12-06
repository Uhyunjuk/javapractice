package com.kh.day10.abstractex;

abstract class Line extends Shape { // 추상메소드(shape)를 가지고있는 클래스(line)이기때문에 여기도 추상클래스로 만들어줘야 오류가없다
	
}

public abstract class Shape {
	public Shape() {} //  shape클래스에 처음만든 메소드는 생성자.
	public void paint() {}
	abstract public void draw();
	
}
