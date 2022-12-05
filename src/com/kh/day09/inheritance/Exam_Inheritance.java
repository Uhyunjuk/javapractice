package com.kh.day09.inheritance; // 상속

import com.kh.day09.point.Point;

class BlackPoint extends Point{
	void set() { // 부모의 멤버변수는 메소드 안에서 ! 
		
		//pri = 4;
		
		
	}
}
class Child extends Parent {
	// extends기준으로 오른쪽이 부모 왼쪽이 자식
	void set() {
		pub = 1;
		def = 2;
		pro = 3;
		//pri = 4;
	}
}

class Parent {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public Parent() {}

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


