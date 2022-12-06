package com.kh.day10.interfaceex;

public interface PhoneInterface { // 인터페이스 선언
//	private String name; // private 안됨
	public String NAME = ""; // 상수 대문자로, 기울여짐(static생략되어있음)
//	name = "Hello World"; // 실행x, 상수값이라서 바뀌지 않음.
	public static final int TIME_OUT = 10000; // 상수필드 선언(대문자로)
	public void sendCall(); // 추상메소드 이렇게 써도 가능
	public abstract void receiveCall(); // 이렇게 써도 가능
	abstract void printLogo(); // 이렇게 써도 가능
	void displayNumber(); // 이렇게 써도 가능
	default void showLogo() { // default 메소드(자바8추가)
		// 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성함.
		System.out.println("** LG **");
	}
}

