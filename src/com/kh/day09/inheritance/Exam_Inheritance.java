package com.kh.day09.inheritance; // 상속

class Child extends Parent { // extends기준으로 오른쪽이 부모 왼쪽이 자식
//아무것도 적지않았지만 상속으로 인해 부모클래스의 필드와 메소드를 쓸수있음
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
		System.out.println("Parent money : " + child.getMoney()); // money 그냥 가져올수 없으니까 getMoney메소드로 가져온다
	}

}
