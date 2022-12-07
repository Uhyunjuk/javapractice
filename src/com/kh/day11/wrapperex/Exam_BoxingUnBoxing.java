package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {

	public static void main(String[] args) {
		Integer num = Integer.valueOf(0);
		// Boxing(자동 박싱)
		Integer su = 10;
		
		int soo = num.intValue(); // num 객체를 기본형으로 다루기
		// UnBoxing(자동 언박싱)
		soo = num;
		
		int n = 10;
		Integer intObject = n;
		System.out.println("intObject = " + intObject); // Boxing
	
		int m = intObject + 10;
		System.out.println("m = " + m); // UnBoxing
	}

}
