package com.kh.day07.oop;

public class Rectangle { // 클래스 선언, 접근지정자 public
	// 필드영역
	public int width;
	public int height;
	
	// 메소드 영역
	// 생성자 -> 객체생성, 객체초기화하는 역할
	// 반환형없는 생성자
	public Rectangle () {} 
	
	// 매개변수 있는 생성자(전달값을 받을 수 있는 생성자)
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 반환형이 있는 메소드
	// getArea를 호출한 곳으로 값을 보낸다(리턴)
	public int getArea() { // void에 int 쓰기
		int area = width*height;
		return area;
	}
}
