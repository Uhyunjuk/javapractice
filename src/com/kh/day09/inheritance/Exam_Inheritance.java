package com.kh.day09.inheritance; // ���

class Child extends Parent { // extends�������� �������� �θ� ������ �ڽ�
//�ƹ��͵� �����ʾ����� ������� ���� �θ�Ŭ������ �ʵ�� �޼ҵ带 ��������
}

class Parent {
	private int money = 2000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money += money;
	}
}

public class Exam_Inheritance {

	public static void main(String[] args) {
		Child child = new Child();
		child.setMoney(3000);
		System.out.println("Parent money : " + child.getMoney()); // money �׳� �����ü� �����ϱ� getMoney�޼ҵ�� �����´�
	}

}
