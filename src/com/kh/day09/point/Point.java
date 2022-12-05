package com.kh.day09.point; //부모

public class Point {
	private int x, y;
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public void showPoint() { // 좌표출력
		System.out.println("(" + x + "," + y + ")");
	}
}
