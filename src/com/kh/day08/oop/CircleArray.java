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
		Circle[] c; // ��ü�迭
		c = new Circle[5]; // ������ �������
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i); // �̶� ȭ��ǥ�� ����, ��ü��������.
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print((int) c[i].getArea() + " ");
		}
	}

}
