package com.kh.day07.oop;

public class Circle { //클래스 선언(class Circle), 클래스 접근권한:public
	// 필드 영역
	public int radius; // 접근 지정자 public 
	public String name; // 접근 지정자 public 
	
	
	// 메소드 영역
	// 생성자 : 객체 생성, 필드 초기화하는 역할
	public Circle() {  // 클래스명과 이름이 같은 메소드 -> 생성자
		this.radius = 1;
		this.name = "원";
	}
	
	// 반환형(double)있는 메소드 (반환값이 있음,return)
	public double getArea() { 
		double area = 3.14*radius*radius;
		return area;
		// return 3.14*radius*radius; // 둘의 차이는 변수를 썼느냐 안썼느냐의 차이
	}
}
