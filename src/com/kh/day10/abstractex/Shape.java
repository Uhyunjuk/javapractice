package com.kh.day10.abstractex;

abstract class Line extends Shape { // �߻�޼ҵ�(shape)�� �������ִ� Ŭ����(line)�̱⶧���� ���⵵ �߻�Ŭ������ �������� ����������
	
}

public abstract class Shape {
	public Shape() {} //  shapeŬ������ ó������ �޼ҵ�� ������.
	public void paint() {}
	abstract public void draw();
	
}
