package com.kh.day09.point; //�θ�

public class Point {
	private int x, y;
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public void showPoint() { // ��ǥ���
		System.out.println("(" + x + "," + y + ")");
	}
}
