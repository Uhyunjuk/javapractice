package com.kh.day07.oop;

public class Circle { //Ŭ���� ����(class Circle), Ŭ���� ���ٱ���:public
	// �ʵ� ����
	public int radius; // ���� ������ public 
	public String name; // ���� ������ public 
	
	
	// �޼ҵ� ����
	// ������ : ��ü ����, �ʵ� �ʱ�ȭ�ϴ� ����
	public Circle() {  // Ŭ������� �̸��� ���� �޼ҵ� -> ������
		this.radius = 1;
		this.name = "��";
	}
	
	// ��ȯ��(double)�ִ� �޼ҵ� (��ȯ���� ����,return)
	public double getArea() { 
		double area = 3.14*radius*radius;
		return area;
		// return 3.14*radius*radius; // ���� ���̴� ������ ����� �Ƚ������ ����
	}
}
