package com.kh.day07.oop;

public class Rectangle { // Ŭ���� ����, ���������� public
	// �ʵ念��
	public int width;
	public int height;
	
	// �޼ҵ� ����
	// ������ -> ��ü����, ��ü�ʱ�ȭ�ϴ� ����
	// ��ȯ������ ������
	public Rectangle () {} 
	
	// �Ű����� �ִ� ������(���ް��� ���� �� �ִ� ������)
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// ��ȯ���� �ִ� �޼ҵ�
	// getArea�� ȣ���� ������ ���� ������(����)
	public int getArea() { // void�� int ����
		int area = width*height;
		return area;
	}
}
