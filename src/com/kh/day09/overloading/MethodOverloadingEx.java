package com.kh.day09.overloading;

class Weapon {
	// 생성자가 결국 오버로딩 형식
	public Weapon() {}
	public Weapon(int value) {
		System.out.println(value);
	}
	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}
	protected int fire() {
		return 1;
	}

	// 오버로딩
	// 자기자신에게 복붙, 매개변수 타입or갯수가 달라짐
	protected int fire(int steampack) {
		return steampack * 100;
	}

	protected int fire(int steampack, int medicine) {
		return steampack+ medicine;
	}

	protected int fire(String steampack) {
		System.out.println(steampack);
		return 1;
	}
}

class Cannon extends Weapon {

	protected int fire() { // 오버라이딩
		return 10;
	}
}

public class MethodOverloadingEx {
	public static void main(String[] args) {

	}
}
