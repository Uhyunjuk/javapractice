package com.kh.day09.point; //�ڽ�

public class ColorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { // ��, ��ǥ ���
		System.out.println(color);
		showPoint(); // PointŬ������ showPoint() ȣ��
		}
}
