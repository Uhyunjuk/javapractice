package com.kh.day08.oop;

class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Circle[] c; // 객체배열
		c = new Circle[5]; // 공간만 만들어짐
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i); // 이때 화살표가 생김, 객체를참조함.
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print((int) c[i].getArea() + " ");
		}
	}

}
